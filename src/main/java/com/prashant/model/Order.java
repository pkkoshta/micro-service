package com.prashant.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_tb")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer oId;
	private String amount;
	private String productName;
	private String orderId;
	
	public Order() {
	}
	



	public Order(String amount, String productName, String orderId) {
		this.amount = amount;
		this.productName = productName;
		this.orderId = orderId;
	}




	


	public Integer getoId() {
		return oId;
	}




	public void setoId(Integer oId) {
		
		this.oId = oId;
	}




	public String getOrderId() {
		return orderId;
	}




	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}




	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	
	
	

	
}
