package com.example.validationservice;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by magemello on 15/08/2017.
 */
public class PasswordSecurityValidator implements ConstraintValidator<PasswordSecurity, String> {

    Set<String> blackListPassword;

    public PasswordSecurityValidator(){
        blackListPassword = new HashSet<>();
        blackListPassword.add("mario");
        blackListPassword.add("123456");
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (blackListPassword.contains(value)) {
            return false;
        }
        return true;
    }

}
