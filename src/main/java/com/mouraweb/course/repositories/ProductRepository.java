package com.mouraweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouraweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
