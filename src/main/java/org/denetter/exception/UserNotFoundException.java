package org.denetter.exception;

import java.util.UUID;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(UUID uuid) {
        super("Could not find user by uuid " + uuid.toString());
    }
}
