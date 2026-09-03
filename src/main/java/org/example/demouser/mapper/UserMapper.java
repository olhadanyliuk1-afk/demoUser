package org.example.demouser.mapper;

import org.example.demouser.controller.dto.UserCreateDTO;
import org.example.demouser.controller.dto.UserResponseDTO;
import org.example.demouser.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserResponseDTO toDTO(User user) {
        UserResponseDTO dto = new UserResponseDTO();

        dto.setId(user.getId());
        dto.setEmail(user.getEmail());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setStatus(user.getStatus());
        return dto;
    }

    public User toEntity(UserCreateDTO dto) {
        User user = new User();

        user.setEmail(dto.getEmail());
        user.setUsername(dto.getUsername());
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setPassword(dto.getPassword());
        user.setStatus(dto.getStatus());
        return user;
    }
}
