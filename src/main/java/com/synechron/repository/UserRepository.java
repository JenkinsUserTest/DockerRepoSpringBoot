package com.synechron.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synechron.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
