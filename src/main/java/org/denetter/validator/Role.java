package org.denetter.validator;


import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = RoleValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Role {
    String message() default "{Role}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
