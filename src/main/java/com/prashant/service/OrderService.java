package com.prashant.service;

import com.prashant.dto.TransactionRequest;
import com.prashant.model.Order;

public interface OrderService {
	
	public Order saveOrder(TransactionRequest transactionReq);

}
