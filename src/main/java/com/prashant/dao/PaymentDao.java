package com.prashant.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prashant.model.Payment;

@Repository
public interface PaymentDao extends JpaRepository<Payment, Integer>{

}
