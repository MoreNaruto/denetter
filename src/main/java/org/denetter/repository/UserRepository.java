package org.denetter.repository;

import org.denetter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u.uuid FROM user u where u.uuid = :uuid")
    Optional<User> findUserByUuid(@Param("uuid") UUID uuid);

    @Query("DELETE FROM user u where u.uuid = :uuid")
    void deleteUserByUuid(@Param("uuid") UUID uuid);
}
