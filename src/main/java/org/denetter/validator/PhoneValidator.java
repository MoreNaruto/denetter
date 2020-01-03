package org.denetter.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidator implements ConstraintValidator<Phone, String> {

    @Override
    public void initialize(Phone phone) {
    }

    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext ctx) {
        if (phoneNumber == null) {
            return true;
        }

        //validate phone numbers of format "1234567890"
        if (phoneNumber.matches("\\d{10}")) {
            return true;
        }
        //validating phone number with -, . or spaces
        else if (phoneNumber.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) {
            return true;
        }
        //validating phone number with extension length from 3 to 5
        else if (phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) {
            return true;
        }
        //validating phone number where area code is in braces ()
        else //return false if nothing matches the input
            return phoneNumber.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}");
    }

}
