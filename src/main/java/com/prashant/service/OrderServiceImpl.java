package com.prashant.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prashant.common.Payment;
import com.prashant.dao.OrderDao;
import com.prashant.dto.TransactionRequest;
import com.prashant.model.Order;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderDao orderDao;

	@Autowired
	private RestTemplate restTemplete;
	
	@Override
	public Order saveOrder(TransactionRequest transactionReq) {
		Order order =	transactionReq.getOrder();
		Payment payment = transactionReq.getPayment();
		payment.setAmount(order.getAmount());
		payment.setOrderId(order.getOrderId());
		Payment paymentResponse = restTemplete.postForObject("http://PAYMENT-SERVICE/payment/doPayment", payment, Payment.class);
		System.out.println("Payemt Resposne "+ paymentResponse.toString());
		return orderDao.save(order);
	}

}
