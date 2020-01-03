package org.denetter.controller;

import org.denetter.exception.UserNotFoundException;
import org.denetter.model.User;
import org.denetter.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/user")
    List<User> getAllUsers() {
        return repository.findAll();
    }

    @PostMapping("/user")
    User createUser(@RequestBody User user) {
        return repository.save(user);
    }

    @GetMapping("/user/{uuid}")
    User getUserById(@PathVariable UUID uuid) throws UserNotFoundException {

        return repository.findUserByUuid(uuid)
                .orElseThrow(() -> new UserNotFoundException(uuid));
    }

    @PutMapping("/user/{uuid}")
    User updateUser(@RequestBody User user, @PathVariable UUID uuid) throws UserNotFoundException {

        return repository.findUserByUuid(uuid)
                .map(retrievedUser -> {
                    retrievedUser.setUsername(user.getUsername());
                    retrievedUser.setAge(user.getAge());
                    retrievedUser.setRole(user.getRole());
                    return repository.save(retrievedUser);
                })
                .orElseThrow(() -> new UserNotFoundException(uuid));
    }

    @DeleteMapping("/user/{id}")
    void deleteUser(@PathVariable UUID uuid) {
        repository.deleteUserByUuid(uuid);
    }
}
