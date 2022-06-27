package com.demo.rest.security;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.demo.rest.entity.User;
import com.demo.rest.repository.UserRepository;

@Service
public class UserServiceInit implements CommandLineRunner {
	
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public UserServiceInit(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
    	
        this.userRepository.deleteAll();

        User admin = new User("admin",passwordEncoder.encode("admin123"),"ADMIN","ACCESS_TEST1,ACCESS_TEST2");
        User manager = new User("manager",passwordEncoder.encode("manager123"),"MANAGER","ACCESS_TEST1");

        List<User> users = Arrays.asList(admin,manager);

        this.userRepository.saveAll(users);
    }
}
