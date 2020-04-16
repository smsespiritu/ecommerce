package com.orders.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.orders.dao.OrderDao;
import com.orders.model.Order;
import com.orders.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderDao orderDao;
	
	@Transactional
	public void add(Order order) {
		orderDao.add(order);
	}

	@Transactional
	public void edit(Order order) {
		orderDao.edit(order);
	}

	@Transactional
	public void delete(String orderid) {
		orderDao.delete(orderid);
	}

	@Transactional
	public Order getOrder(String orderid) {
		return orderDao.getOrder(orderid);
	}

	@Transactional
	public List getAllOrders() {
		return orderDao.getAllOrders();
	}

}
