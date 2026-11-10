package com.example.new_lms.department.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="department")
public class Department {
    @Id
    private int id;

    @Column(nullable = false)
    private String name;
}
