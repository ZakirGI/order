package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Order;
import com.example.demo.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	public void createOrder(Order order) {
		orderRepository.save(order);
	}

	public Iterable<Order> getOrders() {
		return orderRepository.findAll();
	}
}