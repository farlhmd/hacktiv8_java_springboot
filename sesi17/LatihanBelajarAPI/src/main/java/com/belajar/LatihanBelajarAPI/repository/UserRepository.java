package com.belajar.LatihanBelajarAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.belajar.LatihanBelajarAPI.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
}
