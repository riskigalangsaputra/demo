package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.repo.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author galang
 */
//@Service @AllArgsConstructor
//public class CustomUserDetailsService implements UserDetailsService {
//
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Optional<User> user = userRepository.findByUsernameAndActive(username, true);
//        if (user.isEmpty()) {
//            // trhow error
//        }
//
//        return null;
//    }

public class CustomUserDetailsService {
}
