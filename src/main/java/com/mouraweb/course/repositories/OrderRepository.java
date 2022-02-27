package com.mouraweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouraweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
