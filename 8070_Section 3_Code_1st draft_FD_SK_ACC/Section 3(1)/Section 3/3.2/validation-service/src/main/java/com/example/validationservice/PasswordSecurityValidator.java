package com.example.validationservice;

import sun.misc.BASE64Encoder;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by magemello on 14/06/2017.
 */
public class PasswordSecurityValidator implements ConstraintValidator<PasswordSecurity, String> {

    Set<String> blackListPassword;

    public PasswordSecurityValidator(){
        blackListPassword = new HashSet<>();
        blackListPassword.add(new BASE64Encoder().encode("mario".getBytes()));
        blackListPassword.add(new BASE64Encoder().encode("123456".getBytes()));
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (blackListPassword.contains(value)) {
            return false;
        }
        return true;
    }

}
