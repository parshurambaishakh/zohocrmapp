package com.zohocrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entitities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
