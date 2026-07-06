package org.example.demouser.service;

import org.example.demouser.controller.dto.UserCreateDTO;
import org.example.demouser.controller.dto.UserResponseDTO;
import org.example.demouser.entity.User;
import org.example.demouser.controller.exception.EmailAlreadyExistException;
import org.example.demouser.mapper.UserMapper;
import org.example.demouser.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    public final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponseDTO createUser(UserCreateDTO dto) {
        if (userRepository.existsByEmail((dto.getEmail()))) {
            throw new EmailAlreadyExistException(
                    "Email already exists : " + dto.getEmail()
            );
        }
        User user = UserMapper.toEntity(dto);
        User savedUser = userRepository.save(user);
        return UserMapper.toDTO(savedUser);
    }

    public List<UserResponseDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(UserMapper::toDTO)
                .toList();
    }

    public Optional<UserResponseDTO> getById(Long id) {
        return userRepository.findById(id).map(UserMapper::toDTO);
    }
}

