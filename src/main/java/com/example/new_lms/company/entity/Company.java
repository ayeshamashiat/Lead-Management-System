package com.example.new_lms.company.entity;

import jakarta.persistence.*;

@Entity
@Table(name="company")
public class Company{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="company-name")
    private String companyname;

    @Column(name="email")
    private String email;

    @Column(name="phone")
    private String phone;

    @Column(name="website")
    private String website;

    @Column(name = "address")
    private String address;

    @Column(name="is_active")
    private boolean is_active;

}