package com.example.new_lms.user.repository;

import com.example.new_lms.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public class UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email) {}

}
