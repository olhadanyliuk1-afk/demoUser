package org.example.demouser.controller.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.demouser.enums.Status;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateDTO {
    @Email(message = "Email should be valid")
    @NotBlank(message = "Email should not be empty")
    private String email;
    @NotBlank(message = "Username should not be empty")
    private String username;
    private String firstName;
    private String lastName;
    @Size(min = 6, message = "Password should contain 6 characters")
    private String password;
    private Status status;
}

