package com.example.new_lms.lead.entity;

import com.example.new_lms.company.entity.Company;
import com.example.new_lms.company.entity.Company_contact;
import jakarta.persistence.*;

@Entity
@Table(name="lead")
public class lead {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="leadcode",nullable = false)
    private String leadcode;

    @Column(name="leadname")
    private String leadname;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="company_id", nullable=false)
    private Company company;

    @Column(name="source_id")
    private Long source_id;

    @Enumerated(EnumType.STRING)
    @Column(name = "stage",nullable=false)
    private LeadStage stage = LeadStage.NEW;

    @Column(name="owner_id")
    private Long owner_id;

    @Column(name="is_active")
    private boolean is_active;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="company_contact_id")
    private Company_contact company_contact;



}
