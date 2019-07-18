package com.fy.controller;

import com.fy.entity.*;
import com.fy.service.OrderService;
import com.fy.utils.DataGrid;
import com.fy.utils.PageUtils;
import com.fy.utils.StrTool;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by 51589 on 2019/7/13.
 */
@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("getOrderList")
    @ResponseBody
    //查询旅游订单数据
    public DataGrid<Order> getOrderList(@RequestBody PageUtils pageUtils){
        return orderService.getOrderList(pageUtils);
    }
    @RequestMapping("getItemList")
    @ResponseBody
    //查询商品订单数据
    public DataGrid<Order> getItemList(@RequestBody PageUtils pageUtils){
       return orderService. selectItemList(pageUtils);
    }

    @RequestMapping("deleteOrder")
    @ResponseBody
    //根据单号删除旅游订单数据
    public void deleteOrder(String id){
        orderService. deleteOrder(id);
    }
    @RequestMapping("deleteItemOrder")
    @ResponseBody
    //根据单号删除商品订单数据
    public void deleteItemOrder(String id){
        orderService. deleteItemOrder(id);
    }


    @RequestMapping("addSpots")
    @ResponseBody
    //增加旅游订单
    public String addSpots(User user,Order order,Spots spots){
        //此处省略2个接口调用：用户接口，旅游门票信息接口 {全部放到方法参数中}
        user.setUserId(3);
        user.setUserName("许震");
        user.setUserPhone("15698495677");

        spots.setSpotsId(1);
        spots.setSpotsPrice(888.8);//门票价格
        spots.setSpotsName("北京世界动物园");//门票名称

        order.setOrderSpotsStatus(1011);//订单状态
        order.setOrederCount(3);//购买数量
        order.setOrderRemark("记得这次给一次性避孕套哦");//备注


        return orderService.addSpots(user,order,spots);
    }
    @RequestMapping("addItem")
    @ResponseBody
    //增加商品订单
    public String addItem(User user,Order order, ItemSpu itemSpu,Site site){
        //此处省略2个接口调用：用户接口，商品信息接口 {全部放到方法参数中}

        //用户主键
        user.setUserId(1);
        //收货详情
        site.setSiteName("许震");//收货人
        site.setSitePhone("13834074724");//收货人手机号
        site.setSiteParticular("山西临汾市襄汾县");//收货地址

        //spu
        itemSpu.setItemId(1);//spu主键
        itemSpu.setItemName("精品挂坠");//商品名称
        itemSpu.setItemType(1);//商品类型
        itemSpu.setItemAddress("陕西延安");//商品产地

        //sku
        ItemSku itemSku = new ItemSku();
        itemSku.setItemId(1);//关联的spu主键
        itemSku.setIskuSalePrice(77.8);//商品单价
        itemSku.setIskuKeepCount(999);

        List<ItemAttr> itemAttrList = new ArrayList<ItemAttr>();
        List<ItemSku> itemSkuList = new ArrayList<ItemSku>();

        //attr
        ItemAttr itemAttr= new ItemAttr();
        itemAttr.setIskuId(1);//关联sku
        itemAttr.setAttrAttrKey("颜色");//类型属性
        itemAttr.setAttrAttrValue("琉璃绿");//类型值
        itemAttrList.add(itemAttr);//attr放入集合
        itemSku.setItemAttrList(itemAttrList);//attr集合放入sku对象
        itemSkuList.add(itemSku);//sku对象放入集合
        itemSpu.setItemSkuList(itemSkuList);//sku集合放入spu对象



        //订单
        order.setOrderTradeStatus(1011);//订单状态
        order.setOrederCount(3);//购买数量
        order.setOrderRemark("记得这次给一次性手套哦");//备注



        return orderService.addItem(user,site,itemSpu,order);
    }
}
