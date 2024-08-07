package com.demo.contacts;

import com.demo.contacts.model.Contact;
import com.demo.contacts.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contacts")
public class ContactController {

    ContactRepository contactRepository;

    @Autowired
    public ContactController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    /**
    Save Contact
    @RequestBody Contact user
    @return ResponseEntity with status code 201 and the contact saved
     */
    @PostMapping("/save")
    public ResponseEntity saveContact(@RequestBody Contact user){
        //*********************** NEW VALIDATION ***********************/    


        //**************************************************************/

        contactRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user.toString());
    }

    //*********************** NEW ENDPOINTS ***************************/

    //*****************************************************************/

}