package com.hirushnetworking.orderservices.repository;

import com.hirushnetworking.orderservices.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
