package com.zohocrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entitities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
