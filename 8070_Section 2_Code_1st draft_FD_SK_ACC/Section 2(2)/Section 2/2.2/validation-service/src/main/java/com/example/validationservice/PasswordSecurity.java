package com.example.validationservice;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by magemello on 14/06/2017.
 */
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {PasswordSecurityValidator.class})
@interface PasswordSecurity {

    String message() default "not secure enough";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
