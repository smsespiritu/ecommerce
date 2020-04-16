package com.orders.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.orders.model.Order;
import com.orders.service.OrderService;

@Controller
public class StudentController {
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
		Order order = new Order();
		map.put("order", order);
		map.put("orderList", orderService.getAllOrders());
		return "student";
	}
	@RequestMapping(value="/order.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Order order, BindingResult result, @RequestParam String action, Map<String, Object> map){
		Order orderResult = new Order();
		switch(action.toLowerCase()){	//only in Java7 you can put String in switch
		case "add":
			orderService.add(order);
			orderResult = order;
			break;
		case "edit":
			orderService.edit(order);
			orderResult = order;
			break;
		case "delete":
			orderService.delete(order.getOrderId());
			orderResult = new Order();
			break;
		case "search":
			Order searchedOrder = orderService.getOrder(order.getOrderId());
			orderResult = searchedOrder!=null ? searchedOrder : new Order();
			break;
		}
		map.put("order", orderResult);
		map.put("orderList", orderService.getAllOrders());
		return "order";
	}
}
