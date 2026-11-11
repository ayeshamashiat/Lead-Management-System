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
    private String employeeId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    private String phone;

    private boolean active = true;

    @ManyToOne
    @JoinColumn(name = "roleId")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "departmentId")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "managerId")
    private User manager;
}
