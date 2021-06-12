package com.prashant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prashant.common.Payment;
import com.prashant.dto.TransactionRequest;
import com.prashant.model.Order;
import com.prashant.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService orservice;

	@PostMapping("/saveorder")
	public Order saveOrder(@RequestBody TransactionRequest transactionReq) {
		
	return	orservice.saveOrder(transactionReq);
	}
}
