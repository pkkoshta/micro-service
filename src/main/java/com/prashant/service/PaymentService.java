package com.prashant.service;

import com.prashant.model.Payment;

public interface PaymentService {
	
	public Payment savePay(Payment payment);

	public Payment findOrder(String orderId);

}
