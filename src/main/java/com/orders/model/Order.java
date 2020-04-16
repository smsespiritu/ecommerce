package com.orders.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {
	@Id
	@Column
	//@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
	private String orderid;
	@Column
	private String item;
	@Column
	private String basket;
	@Column
	private String customer;
	
	public Order(){}
	public Order(String orderid, String item, String basket,
			String customer) {
		super();
		this.orderid = orderid;
		this.item = item;
		this.basket = basket;
		this.customer = customer;
	}
	public String getOrderId() {
		return orderid;
	}
	public void setOrderId(String orderid) {
		this.orderid = orderid;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getBasket() {
		return basket;
	}
	public void setBasket(String basket) {
		this.basket = basket;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	
}
