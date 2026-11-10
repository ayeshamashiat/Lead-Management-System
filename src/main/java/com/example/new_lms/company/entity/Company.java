package com.example.new_lms.company.entity;

import jakarta.persistence.*;

@Entity
@Table(name="company")
public class Comapny{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="company-name")
    private String companyname;

    @Column(name="email")
    private String phone;

    @Column()

}