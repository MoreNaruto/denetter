package org.denetter.validator;

import org.denetter.enumerator.Role;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RoleValidator implements ConstraintValidator<org.denetter.validator.Role, String> {

    @Override
    public void initialize(org.denetter.validator.Role role) {
    }

    @Override
    public boolean isValid(String role, ConstraintValidatorContext ctx) {
        if (role == null) {
            return false;
        }

        return !Role.valueOf(role.toUpperCase()).name().isEmpty();
    }

}
