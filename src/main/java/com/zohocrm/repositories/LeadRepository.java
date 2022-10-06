package com.zohocrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entitities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
