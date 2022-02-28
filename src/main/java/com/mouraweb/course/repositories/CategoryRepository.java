package com.mouraweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouraweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
