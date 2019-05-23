package com.example.validationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by magemello on 14/06/2017.
 */
@RestController
@RequestMapping("/userxml")
public class UserXmlRestController {

    @Autowired
    UserRestResource userRestResource;

    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<?> get() {
        return new ResponseEntity<User>(userRestResource.findByUsername("mario"), HttpStatus.OK);
    }

}
