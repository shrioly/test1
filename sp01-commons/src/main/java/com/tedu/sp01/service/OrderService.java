package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

public interface OrderService {
	
	/**
	 * 获取订单数据
	 * @param order
	 */
	
	Order getOrder(String orderId);
	
	//保存订单数据
	void addOrder(Order order);
}
