package com.demo.contacts;

import com.demo.contacts.model.Contact;
import com.demo.contacts.repositories.ContactRepository;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.TestDatabaseAutoConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;


@DataJpaTest(excludeAutoConfiguration = TestDatabaseAutoConfiguration.class)
@ContextConfiguration(classes = ContactApplication.class)
public class ControllerIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ContactRepository contactRepository;

    @BeforeEach
    public void setUp() {
        contactRepository.deleteAll();
    }

    // test
    @Test
    public void testSaveContact() {
        Contact user = new Contact("kate","email","555-978-2254");
        Contact savedUser = contactRepository.save(user);
        Contact existUser = entityManager.find(Contact.class, savedUser.getContactID());
        assertThat(user.getName()).isEqualTo(existUser.getName());
    }

    //*********************** NEW Test Cases ***************************/
    
    //******************************************************************/
}