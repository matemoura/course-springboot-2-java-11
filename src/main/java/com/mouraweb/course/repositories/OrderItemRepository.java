package com.mouraweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouraweb.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
