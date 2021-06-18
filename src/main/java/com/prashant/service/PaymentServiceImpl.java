package com.prashant.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prashant.dao.PaymentDao;
import com.prashant.model.Payment;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	private PaymentDao dao;

	@Override
	public Payment savePay(Payment payment) {
		payment.setStatus(paymentProcessing() );
		payment.setTransactionId(UUID.randomUUID().toString());
		return dao.save(payment);
	}

	public String paymentProcessing() {
		return new Random().nextBoolean() ? "success": "false";
	}

	@Override
	public Payment findOrder(String orderId) {
		
		return dao.findByOrderId(orderId);
	}


}
