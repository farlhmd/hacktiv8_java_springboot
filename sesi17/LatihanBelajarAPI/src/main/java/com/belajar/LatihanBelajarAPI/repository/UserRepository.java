package com.belajar.LatihanBelajarAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.LatihanBelajarAPI.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {
    
}
