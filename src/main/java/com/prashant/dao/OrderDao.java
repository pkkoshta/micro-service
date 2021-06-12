package com.prashant.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prashant.model.Order;

@Repository
public interface OrderDao extends JpaRepository<Order, Integer> {

}
