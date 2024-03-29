package com.fyp.siri.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fyp.siri.models.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

	ArrayList<Order> findByEmail(String userEmail);

}
