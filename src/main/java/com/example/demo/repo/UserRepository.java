package com.example.demo.repo;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author galang
 */
public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByUsernameAndActive(String username, boolean active);
}
