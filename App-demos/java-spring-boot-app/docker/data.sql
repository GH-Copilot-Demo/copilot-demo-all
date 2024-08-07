CREATE DATABASE IF NOT EXISTS CONTACT_APP;

USE CONTACT_APP;

CREATE TABLE contacts(
    contactID int NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    phone VARCHAR(255) NOT NULL,
    PRIMARY KEY(contactID)
);

INSERT INTO contacts(name, email, phone) VALUES ("John", "John@gmail.com", "555-435-2345");
INSERT INTO contacts(name, email, phone) VALUES ("Jane", "Jane@hotmail.com", "555-896-5322");


