package com.mouraweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouraweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
