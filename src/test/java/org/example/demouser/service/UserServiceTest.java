package org.example.demouser.service;

import org.example.demouser.controller.dto.UserCreateDTO;
import org.example.demouser.controller.dto.UserResponseDTO;
import org.example.demouser.entity.User;
import org.example.demouser.mapper.UserMapper;
import org.example.demouser.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    @Mock
    private UserRepository userRepository;
    @InjectMocks
    private UserService userService;
    @Mock
    private UserMapper userMapper;

    public UserServiceTest() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void createUserTest(){
        User testUser = new User();
        testUser.setFirstName("testFirstName");
        testUser.setLastName("testLastName");
        testUser.setEmail("testEmail");
        testUser.setPassword("testPassword");

        UserResponseDTO testUserResponseDTO = new UserResponseDTO();
        testUserResponseDTO.setFirstName("testFirstName");
        testUserResponseDTO.setLastName("testLastName");
        testUserResponseDTO.setEmail("testEmail");

        UserCreateDTO testUserCreateDTO =  new UserCreateDTO();
        testUserCreateDTO.setFirstName("testFirstName");
        testUserCreateDTO.setLastName("testLastName");
        testUserCreateDTO.setEmail("testEmail");
        testUserCreateDTO.setPassword("testPassword");

        when(userMapper.toEntity(testUserCreateDTO)).thenReturn(testUser);
        when(userRepository.save(testUser)).thenReturn(testUser);//замокала
        when(userMapper.toDTO(testUser)).thenReturn(testUserResponseDTO);

        UserResponseDTO result = userService.createUser(testUserCreateDTO);

        verify(userMapper).toEntity(testUserCreateDTO);
        verify(userRepository).save(testUser);
        verify(userMapper).toDTO(testUser);


    assertEquals(result,testUserResponseDTO);

    }

}
