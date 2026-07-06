package org.example.demouser.controller.dto;

import lombok.Getter;
import lombok.Setter;
import org.example.demouser.enums.Status;

@Getter
@Setter
public class UserResponseDTO {
    private Long id;
    private String email;
    private String username;
    private String firstName;
    private String lastName;
    private Status status;
}
