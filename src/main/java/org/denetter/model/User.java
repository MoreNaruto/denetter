package org.denetter.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.denetter.enumerator.Role;
import org.denetter.validator.Phone;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "uuid", columnDefinition = "BINARY(16)", updatable = false, nullable = false, unique = true)
    private UUID uuid;

    @NotBlank
    @Column(unique = true)
    @Size(min = 1, max = 100)
    private String username;

    @NotBlank
    @Size(max = 100)
    private String firstName;

    @Size(max = 100)
    private String lastName;

    @NotEmpty
    @Email
    private String email;

    @NotNull
    @Max(150)
    private int age;

    @DateTimeFormat(pattern = "MM/dd/yyyy")
    @NotNull
    @Past
    private Date birthday;

    @NotNull
    private Role role;

    @Phone
    private String phone;

    @CreationTimestamp
    @Column(name = "createdAt", columnDefinition = "timestamp", updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updatedAt", columnDefinition = "timestamp")
    private LocalDateTime updatedAt;
}
