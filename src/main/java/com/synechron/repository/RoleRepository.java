package com.synechron.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synechron.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
