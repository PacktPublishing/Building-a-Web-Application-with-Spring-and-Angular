package com.example.validationservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by magemello on 14/06/2017.
 */
@RestController("/")
class UserRestController{

    @PostMapping("/user")
    public ResponseEntity<?> set(@Validated @RequestBody User user){
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

}
