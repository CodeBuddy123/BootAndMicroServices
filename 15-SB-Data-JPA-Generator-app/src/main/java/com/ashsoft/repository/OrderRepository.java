package com.ashsoft.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashsoft.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Serializable> {

}
