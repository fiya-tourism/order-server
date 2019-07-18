package com.fy.service.impl;

import com.fy.entity.*;
import com.fy.mapper.OrderMapper;
import com.fy.service.OrderService;
import com.fy.utils.DataGrid;
import com.fy.utils.PageUtils;
import com.fy.utils.StrTool;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by 51589 on 2019/7/13.
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    //查询旅游订单
    public DataGrid<Order> getOrderList(@RequestBody PageUtils page){
        String s = StrTool.humpToLine2(page.getSort());
        page.setSort(s);
        PageHelper.startPage(page.getPage(),page.getRows());
        List<Order> list = orderMapper.select(page);
        PageInfo pageInfo = new PageInfo<>(list);
        DataGrid<Order> dg = new DataGrid();
        dg.setRows(list);
        dg.setTotal(pageInfo.getTotal());
        return dg;
    }

    @Override
    //删除旅游订单
    public void deleteOrder(String id) {
        orderMapper.deleteOrder(id);
    }

    @Override
    //增加旅游订单
    public String addSpots(User user, Order order, Spots spots) {
        String format = new SimpleDateFormat("yyyy").format(new Date());
        String format2 = new SimpleDateFormat("MMddHHmmss").format(new Date());
        //旅游订单特定编号
        String lvyou="100";
        //拼接订单编号
        String jieguo=format+lvyou+format2;
        order.setOrderConId(jieguo);//订单编号赋值到对象
        //计算总价
        int orederCount = order.getOrederCount();//获得门票数量
        Double spotsPrice = spots.getSpotsPrice();//获得门票单价
        Double zongjia = orederCount*spotsPrice;//算总价
        order.setOrderTotalPrices(zongjia);//总价赋值

        //增加订单主表
        orderMapper.addSpots(user, order, spots);//新增订单主表
        //增加订单子表
        Order order2=orderMapper.selectByOrderConId(order);//根据订单编号获取主订单
        order.setOrderId(order2.getOrderId());
        if(order2!=null){//如果旅游订单交易状态为已支付添加订单子表
            orderMapper.addChildSpots(order,spots);//新增订单子表
        }
        return jieguo;
    }

    @Override
    public String addItem(User user, Site site, ItemSpu itemSpu, Order order) {
        String format = new SimpleDateFormat("yyyy").format(new Date());
        String format2 = new SimpleDateFormat("MMddHHmmss").format(new Date());
        //旅游订单特定编号
        String lvyou="200";
        //拼接订单编号
        String jieguo=format+lvyou+format2;
        //订单编号赋值到对象
        order.setOrderConId(jieguo);
        //取出sku
        ItemSku itemSku = new ItemSku();
        List<ItemSku> itemSkuList = itemSpu.getItemSkuList();//从spu中获取skuList
        for (int i=0;i<=0;i++){
            itemSku.setIskuSalePrice(itemSkuList.get(i).getIskuSalePrice());//获取价格
            itemSku.setIskuKeepCount(itemSkuList.get(i).getIskuKeepCount());//获取库存
            itemSku.setItemAttrList(itemSkuList.get(i).getItemAttrList());//获取attrList
        }
        //计算总价
        Double zongjia = itemSku.getIskuSalePrice()*order.getOrederCount();
        order.setOrderTotalPrices(zongjia);//总价赋值
        //取出attr
        List<ItemAttr> itemAttrList = itemSku.getItemAttrList();//从sku中获取attrList
        ItemAttr itemAttr = new ItemAttr();//初始化一个attr
        for (int i=0;i<=0;i++){
            itemAttr.setAttrAttrKey(itemAttrList.get(i).getAttrAttrKey());//获取商品属性名
            itemAttr.setAttrAttrValue(itemAttrList.get(i).getAttrAttrValue());//获取商品属性值
        }


        orderMapper.addItem(user, site, itemSpu,itemSku,itemAttr, order);
        //增加订单子表
        Order order2=orderMapper.selectByOrderConId(order);//根据订单编号获取新增的主订单
        order.setOrderId(order2.getOrderId());
        if(order2!=null){//如果旅游订单交易状态为已支付添加订单子表
            orderMapper.addChildItem(user, site, itemSpu,itemSku,itemAttr, order);//新增订单子表
        }
        return jieguo;
    }

    @Override
    public DataGrid<Order> selectItemList(PageUtils page) {
        String s = StrTool.humpToLine2(page.getSort());
        page.setSort(s);
        PageHelper.startPage(page.getPage(),page.getRows());
        List<Order> list = orderMapper.selectItemList(page);
        PageInfo pageInfo = new PageInfo<>(list);
        DataGrid<Order> dg = new DataGrid();
        dg.setRows(list);
        dg.setTotal(pageInfo.getTotal());
        return dg;
    }


    @Override
    //删除商品订单
    public void deleteItemOrder(String id) {
        orderMapper.deleteItemOrder(id);
    }

}
