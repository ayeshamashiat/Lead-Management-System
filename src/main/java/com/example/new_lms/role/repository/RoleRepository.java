package com.example.new_lms.role.repository;

import com.example.new_lms.role.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public abstract class RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name){}
}
