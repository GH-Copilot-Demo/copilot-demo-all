package com.demo.contacts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.contacts.model.Contact;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

    // save contact
    Contact save(Contact user);
    
    // find contact by name
    Contact findByName(String name);

    // find contact by email
    Contact findByEmail(String email);

    // find all contacts
    List<Contact> findAll();

    // delete user by id
    void deleteById(Integer id);

}