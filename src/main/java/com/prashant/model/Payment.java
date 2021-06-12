package com.prashant.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="PAYMENT")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer paymentId;
	private String status;
	private String amount;
	private String orderId;
	private String transactionId;
	
	
	
	public Payment() {
		
	}
	public Payment(Integer paymentId, String status, String amount, String orderId, String transactionId) {
		this.paymentId = paymentId;
		this.status = status;
		this.amount = amount;
		this.orderId = orderId;
		this.transactionId = transactionId;
	}
	
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public Integer getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", status=" + status + ", amount=" + amount + ", orderId=" + orderId
				+ ", transactionId=" + transactionId + "]";
	}
	
	
	
	

}
