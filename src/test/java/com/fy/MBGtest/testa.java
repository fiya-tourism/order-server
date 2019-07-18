package com.fy.MBGtest;

import com.fy.entity.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 许震  phone:13834074724/15698495677
 * @title: testa
 * @projectName united-nations-cbd
 * @description: TODO
 * @date 2019/6/14上午 11:36
 */

public class testa {

    public static void main(String[] args) {

        String format = new SimpleDateFormat("yyyy").format(new Date());
        String format2 = new SimpleDateFormat("MMddHHmmss").format(new Date());
        //旅游订单特定编号
        String lvyou="100";
        //拼接订单编号
        String jieguo=format+lvyou+format2;
        System.out.println(jieguo);

        /*User user =new User();
        Site site = new Site();
        ItemSpu itemSpu = new ItemSpu();
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
        List<ItemSku> itemSkuList = new ArrayList<ItemSku>();
        itemSkuList.add(itemSku);

        //attr
        ItemAttr itemAttr= new ItemAttr();
        itemAttr.setIskuId(1);//关联sku
        itemAttr.setAttrAttrKey("颜色");//类型属性
        itemAttr.setAttrAttrValue("琉璃绿");//类型值

        //将带参数sku集合放入spu对象
        itemSpu.setItemSkuList(itemSkuList);*//*.add(itemSku);*//*

        System.out.println("测试成功");*/
    }
}
