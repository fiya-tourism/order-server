package com.fy.mapper;


import com.fy.entity.*;
import com.fy.utils.PageUtils;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {

    //查询旅游订单
    List<Order> select(PageUtils page);
    //删除旅游订单
    void deleteOrder(String conid);
    //增加旅游订单
    Long addSpots( @Param("user")User user, @Param("order")Order order, @Param("spots")Spots spots);
    //增加旅游子订单
    void addChildSpots( @Param("order")Order order, @Param("spots")Spots spots);
    //查询最大id（用于拼接旅游单号）
    Long selectByMaxId();
    //根据订单号查询对象用于创建子订单
    Order selectByOrderConId(Order order);
    //增加商品订单
    void addItem(@Param("user") User user,
                 @Param("site") Site site,
                 @Param("itemSpu") ItemSpu itemSpu,
                 @Param("itemSku") ItemSku itemSku,
                 @Param("itemAttr") ItemAttr itemAttr,
                 @Param("order") Order order);
    //增加商品子订单
    void addChildItem(@Param("user") User user,
                      @Param("site") Site site,
                      @Param("itemSpu") ItemSpu itemSpu,
                      @Param("itemSku") ItemSku itemSku,
                      @Param("itemAttr") ItemAttr itemAttr,
                      @Param("order") Order order);
    //查询商品订单
    List<Order> selectItemList(PageUtils page);
    //删除商品订单
    void deleteItemOrder(String conid);
}