package com.fy.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {
    //用户id
    private Integer userId;
    //性别 0=男 1=女
    private Integer userSex;
    //年龄
    private Integer userAge;
    //用户头像
    private String userPhoto;
    //手机号
    private String userPhone;
    //身份证
    private String userIdentity;
    //出生日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date userBir;
    //居住城市
    private String userDwell;
    //邮箱
    private String userEmail;
    //个性签名
    private String userSignature;
    //我的收藏
    private Integer userCollect;
    //密码
    private String userPassword;
    //创建时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date comCreate;
    //修改时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date comUpdate;
    //逻辑状态
    private Integer comYn;
    //用户姓名
    private String userName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto == null ? null : userPhoto.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(String userIdentity) {
        this.userIdentity = userIdentity == null ? null : userIdentity.trim();
    }

    public Date getUserBir() {
        return userBir;
    }

    public void setUserBir(Date userBir) {
        this.userBir = userBir;
    }

    public String getUserDwell() {
        return userDwell;
    }

    public void setUserDwell(String userDwell) {
        this.userDwell = userDwell == null ? null : userDwell.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserSignature() {
        return userSignature;
    }

    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature == null ? null : userSignature.trim();
    }

    public Integer getUserCollect() {
        return userCollect;
    }

    public void setUserCollect(Integer userCollect) {
        this.userCollect = userCollect;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}