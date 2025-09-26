package edu.icet.dto;

import edu.icet.enums.RegistrationMethod;
import edu.icet.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer userId;
    private String firstName;
    private String lastName;
    private String primaryEmail;
    private String passwordHash;
    private String phone;
    private Role role;
    private RegistrationMethod registrationMethod;
    private String oauthProvider;
    private String oauthId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
