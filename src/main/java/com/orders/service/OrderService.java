package com.orders.service;

import java.util.List;

import com.orders.model.Order;

public interface OrderService {
	public void add(Order order);
	public void edit(Order order);
	public void delete(String orderid);
	public Order getOrder(String orderid);
	public List getAllOrders();
}
