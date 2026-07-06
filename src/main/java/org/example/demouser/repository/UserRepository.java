package org.example.demouser.repository;

import org.example.demouser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findByStatus(String status);
    List<User> findByUsername(String username);
    boolean existsByEmail(String email);
}
