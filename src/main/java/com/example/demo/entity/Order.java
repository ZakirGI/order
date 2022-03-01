package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Order {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer orderId;

@NotBlank
private String productName;

@NotBlank
private String customerName;

public Order() {
	
}

public Order(Integer orderId, @NotBlank String productName) {
	super();
	this.orderId = orderId;
	this.productName = productName;
}

public Integer getOrderId() {
	return orderId;
}

public void setOrderId(Integer orderId) {
	this.orderId = orderId;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}



}