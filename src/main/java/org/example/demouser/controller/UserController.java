package org.example.demouser.controller;


import jakarta.validation.Valid;
import org.example.demouser.controller.dto.UserCreateDTO;
import org.example.demouser.controller.dto.UserResponseDTO;
import org.example.demouser.controller.exception.UserIdNotFoundException;
import org.example.demouser.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserResponseDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> getById(@PathVariable Long id) {
      UserResponseDTO user = userService.getById(id)
                .orElseThrow(() -> new UserIdNotFoundException("User with id " + id + " not found"));
      return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<UserResponseDTO> createUser(@RequestBody @Valid UserCreateDTO dto) {
        return ResponseEntity.ok(userService.createUser(dto));
    }

}
