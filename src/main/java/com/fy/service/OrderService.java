package com.fy.service;



import com.fy.entity.*;
import com.fy.utils.DataGrid;
import com.fy.utils.PageUtils;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by 51589 on 2019/7/13.
 */

public interface OrderService {
    //查询旅游订单
    DataGrid<Order> getOrderList(PageUtils page);
    //删除旅游订单
    void deleteOrder(String id);
    //增加旅游订单
    String addSpots(User user, Order order, Spots spots);
    //增加商品订单
    String addItem(User user, Site site, ItemSpu itemSpu, Order order);
    //查询商品订单
    DataGrid<Order> selectItemList(PageUtils pageUtils);
    //删除商品订单
    void deleteItemOrder(String id);

}
