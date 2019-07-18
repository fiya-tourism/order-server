package com.fy.utils;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class PageUtils {

	/** 当前页 */
	private int page = 1;
	/** 每页条数 */
	private int rows = 3;
	/** 开始条数的下标 */
	private int startPos;

	/** 排序列 */
	private String sort;
	/** 排序方式 */
	private String order;

	// 条件
	private Integer userId; //用户编号
	private String userName;
	@JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date userBir;  //生日
	private String orderConId;  //订单编号

	public String getOrderConId() {
		return orderConId;
	}

	public void setOrderConId(String orderConId) {
		this.orderConId = orderConId;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getStartPos() {
		return startPos;
	}

	public void setStartPos(int startPos) {
		this.startPos = startPos;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getUserBir() {
		return userBir;
	}

	public void setUserBir(Date userBir) {
		this.userBir = userBir;
	}
}
