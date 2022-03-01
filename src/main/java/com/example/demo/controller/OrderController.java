package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;

@RestController
public class OrderController {
@Autowired
OrderService orderService;

@GetMapping("/order")
public Iterable<Order> getOrders(){
	return orderService.getOrders();
}

@PostMapping("/order")
@ResponseStatus(code=HttpStatus.CREATED)
public void createOrder(@RequestBody Order order) {
	orderService.createOrder(order);
}
	
	
}