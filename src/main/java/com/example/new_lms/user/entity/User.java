package com.example.new_lms.user.entity;
import jakarta.persistence.*;
import com.example.new_lms.user.entity.User;
import com.example.new_lms.role.entity.Role;
import com.example.new_lms.department.entity.Department;

@Entity
@Table(name="users")
public class User {
    @Id
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    private String phone;

    private boolean active = true;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private User manager;

}
