package com.example.new_lms.department.repository;

import com.example.new_lms.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public abstract class DepartmentRepository extends JpaRepository<Department, Long> {
    Optional<Department> findByName(String name){}
}
