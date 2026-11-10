package com.example.new_lms.lead.repository;

import com.example.new_lms.lead.entity.lead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadRepository extends JpaRepository<lead,Long> {

}
