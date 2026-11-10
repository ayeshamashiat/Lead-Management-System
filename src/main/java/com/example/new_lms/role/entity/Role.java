package com.example.new_lms.role.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="role")
public class Role {
    @Id
    private int id;

    @Column(nullable = false)
    private String name;
}
