package com.fy.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by 51589 on 2019/7/18.
 */
public class OrderChild {
    //子类编号
    private Long orderChildId;
    //商品关联id
    private Integer itemId;
    //订单关联id
    private Long orderIdPk;
    //商品名称
    private String orderChildTradeName;
    //单位
    private Integer orderChildCount;
    //单价
    private Double orderChildPrice;
    //单项总金额 (留给购物车使用)
    private Double orderChildAmout;
    //创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GTM")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createChildDate;
    //修改时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GTM")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderChildUpdate;
    //支付时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GTM")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderChildShop;
    //商品类型
    private Integer  orderChildItemType;
    //商品产地
    private String orderChildItemAddress;
    //商品属性
    private String orderChildItemAttrkey;
    //商品属性值
    private String orderChildItemAttrvalue;

    public Long getOrderChildId() {
        return orderChildId;
    }

    public void setOrderChildId(Long orderChildId) {
        this.orderChildId = orderChildId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Long getOrderIdPk() {
        return orderIdPk;
    }

    public void setOrderIdPk(Long orderIdPk) {
        this.orderIdPk = orderIdPk;
    }

    public String getOrderChildTradeName() {
        return orderChildTradeName;
    }

    public void setOrderChildTradeName(String orderChildTradeName) {
        this.orderChildTradeName = orderChildTradeName;
    }

    public Integer getOrderChildCount() {
        return orderChildCount;
    }

    public void setOrderChildCount(Integer orderChildCount) {
        this.orderChildCount = orderChildCount;
    }

    public Double getOrderChildPrice() {
        return orderChildPrice;
    }

    public void setOrderChildPrice(Double orderChildPrice) {
        this.orderChildPrice = orderChildPrice;
    }

    public Double getOrderChildAmout() {
        return orderChildAmout;
    }

    public void setOrderChildAmout(Double orderChildAmout) {
        this.orderChildAmout = orderChildAmout;
    }

    public Date getCreateChildDate() {
        return createChildDate;
    }

    public void setCreateChildDate(Date createChildDate) {
        this.createChildDate = createChildDate;
    }

    public Date getOrderChildUpdate() {
        return orderChildUpdate;
    }

    public void setOrderChildUpdate(Date orderChildUpdate) {
        this.orderChildUpdate = orderChildUpdate;
    }

    public Date getOrderChildShop() {
        return orderChildShop;
    }

    public void setOrderChildShop(Date orderChildShop) {
        this.orderChildShop = orderChildShop;
    }

    public Integer getOrderChildItemType() {
        return orderChildItemType;
    }

    public void setOrderChildItemType(Integer orderChildItemType) {
        this.orderChildItemType = orderChildItemType;
    }

    public String getOrderChildItemAddress() {
        return orderChildItemAddress;
    }

    public void setOrderChildItemAddress(String orderChildItemAddress) {
        this.orderChildItemAddress = orderChildItemAddress;
    }

    public String getOrderChildItemAttrkey() {
        return orderChildItemAttrkey;
    }

    public void setOrderChildItemAttrkey(String orderChildItemAttrkey) {
        this.orderChildItemAttrkey = orderChildItemAttrkey;
    }

    public String getOrderChildItemAttrvalue() {
        return orderChildItemAttrvalue;
    }

    public void setOrderChildItemAttrvalue(String orderChildItemAttrvalue) {
        this.orderChildItemAttrvalue = orderChildItemAttrvalue;
    }
}
