package com.orders.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.orders.dao.OrderDao;
import com.orders.model.Order;

@Repository
public class OrderDaoImpl implements OrderDao {
	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Order order) {
		session.getCurrentSession().save(order);
	}

	@Override
	public void edit(Order order) {
		session.getCurrentSession().update(order);
	}

	@Override
	public void delete(String orderid) {		
		session.getCurrentSession().delete(getOrder(orderid));
	}

	@Override
	public Order getOrder(String orderid) {
		return (Order)session.getCurrentSession().get(Order.class, orderid);
	}

	@Override
	public List getAllOrders() {
		return session.getCurrentSession().createQuery("from Order").list();
	}

}
