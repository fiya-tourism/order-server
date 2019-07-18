package com.fy.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Site {
    //地址信息id
    private Integer siteId;
    //关联用户id
    private Integer userId;
    //收货人姓名
    private String siteName;
    //所在省
    private String siteProvince;
    //所在市
    private String siteCity;
    //所在县
    private String siteounty ;
    //详细地址(收货人详细地址)
    private String siteParticular;
    //收货人手机号
    private String sitePhone;
    //邮政编码
    private Integer sitePostalcode;
    //默认地址(0=默认地址 1=取消默认)
    private Integer siteDefault;
    //创建时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date comCreate;
    //修改时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date comUpdate;
    //状态(0=展示 1=不展示)
    private Integer comYn;

    public String getSiteProvince() {
        return siteProvince;
    }

    public void setSiteProvince(String siteProvince) {
        this.siteProvince = siteProvince;
    }

    public String getSiteCity() {
        return siteCity;
    }

    public void setSiteCity(String siteCity) {
        this.siteCity = siteCity;
    }

    public String getSiteounty() {
        return siteounty;
    }

    public void setSiteounty(String siteounty) {
        this.siteounty = siteounty;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    public String getSiteParticular() {
        return siteParticular;
    }

    public void setSiteParticular(String siteParticular) {
        this.siteParticular = siteParticular == null ? null : siteParticular.trim();
    }

    public String getSitePhone() {
        return sitePhone;
    }

    public void setSitePhone(String sitePhone) {
        this.sitePhone = sitePhone == null ? null : sitePhone.trim();
    }

    public Integer getSitePostalcode() {
        return sitePostalcode;
    }

    public void setSitePostalcode(Integer sitePostalcode) {
        this.sitePostalcode = sitePostalcode;
    }

    public Integer getSiteDefault() {
        return siteDefault;
    }

    public void setSiteDefault(Integer siteDefault) {
        this.siteDefault = siteDefault;
    }

    public Date getComCreate() {
        return comCreate;
    }

    public void setComCreate(Date comCreate) {
        this.comCreate = comCreate;
    }

    public Date getComUpdate() {
        return comUpdate;
    }

    public void setComUpdate(Date comUpdate) {
        this.comUpdate = comUpdate;
    }

    public Integer getComYn() {
        return comYn;
    }

    public void setComYn(Integer comYn) {
        this.comYn = comYn;
    }
}