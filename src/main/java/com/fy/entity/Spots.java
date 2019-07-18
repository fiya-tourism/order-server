package com.fy.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class Spots {
    //旅游主键
    private Integer spotsId;
    //员工关联字段
    private Integer staffId;
    //景点名称
    private String spotsName;
    //景点类型
    private Integer spotsType;
    //景点介绍
    private String spotsIntroduceId;
    //景点地址
    private String spotsAddress;
    //门票价格
    private Double spotsPrice;
    //资讯电话
    private String spotsPhone;
    //开放时间
    private Date spotsOpenTime;
    //景点门票库存
    private Integer spotsRepertory;
    //景点活动
    private String spotsActivity;
    //集合地点
    private String spotsVenue;
    //出发时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date spotsGotime;
    //发布时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date spotsRelease;
    //创建时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date spotsCreate;
    //修改时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date spotsUpdate;
    //状态
    private Integer spotsYn;

    public Integer getSpotsId() {
        return spotsId;
    }

    public void setSpotsId(Integer spotsId) {
        this.spotsId = spotsId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getSpotsName() {
        return spotsName;
    }

    public void setSpotsName(String spotsName) {
        this.spotsName = spotsName == null ? null : spotsName.trim();
    }

    public Integer getSpotsType() {
        return spotsType;
    }

    public void setSpotsType(Integer spotsType) {
        this.spotsType = spotsType;
    }

    public String getSpotsIntroduceId() {
        return spotsIntroduceId;
    }

    public void setSpotsIntroduceId(String spotsIntroduceId) {
        this.spotsIntroduceId = spotsIntroduceId == null ? null : spotsIntroduceId.trim();
    }

    public String getSpotsAddress() {
        return spotsAddress;
    }

    public void setSpotsAddress(String spotsAddress) {
        this.spotsAddress = spotsAddress == null ? null : spotsAddress.trim();
    }

    public Double getSpotsPrice() {
        return spotsPrice;
    }

    public void setSpotsPrice(Double spotsPrice) {
        this.spotsPrice = spotsPrice;
    }

    public String getSpotsPhone() {
        return spotsPhone;
    }

    public void setSpotsPhone(String spotsPhone) {
        this.spotsPhone = spotsPhone == null ? null : spotsPhone.trim();
    }

    public Date getSpotsOpenTime() {
        return spotsOpenTime;
    }

    public void setSpotsOpenTime(Date spotsOpenTime) {
        this.spotsOpenTime = spotsOpenTime;
    }

    public Integer getSpotsRepertory() {
        return spotsRepertory;
    }

    public void setSpotsRepertory(Integer spotsRepertory) {
        this.spotsRepertory = spotsRepertory;
    }

    public String getSpotsActivity() {
        return spotsActivity;
    }

    public void setSpotsActivity(String spotsActivity) {
        this.spotsActivity = spotsActivity == null ? null : spotsActivity.trim();
    }

    public String getSpotsVenue() {
        return spotsVenue;
    }

    public void setSpotsVenue(String spotsVenue) {
        this.spotsVenue = spotsVenue == null ? null : spotsVenue.trim();
    }

    public Date getSpotsGotime() {
        return spotsGotime;
    }

    public void setSpotsGotime(Date spotsGotime) {
        this.spotsGotime = spotsGotime;
    }

    public Date getSpotsRelease() {
        return spotsRelease;
    }

    public void setSpotsRelease(Date spotsRelease) {
        this.spotsRelease = spotsRelease;
    }

    public Date getSpotsCreate() {
        return spotsCreate;
    }

    public void setSpotsCreate(Date spotsCreate) {
        this.spotsCreate = spotsCreate;
    }

    public Date getSpotsUpdate() {
        return spotsUpdate;
    }

    public void setSpotsUpdate(Date spotsUpdate) {
        this.spotsUpdate = spotsUpdate;
    }

    public Integer getSpotsYn() {
        return spotsYn;
    }

    public void setSpotsYn(Integer spotsYn) {
        this.spotsYn = spotsYn;
    }
}