package com.demo.contacts.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "contacts", schema = "CONTACT_APP")
public class Contact {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Integer contactID;
    private String name;
    private String email;
    private String phone;
    

    public Contact() {
    }

    public Contact(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Integer getContactID() {
        return contactID;
    }

    public void setContactID(Integer contactID) {
        this.contactID = contactID;
    }

    public String getName() {
        return name;
    }

    // set name
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    // set email
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    
    // set phone
    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "{" +
                "id=" + contactID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}