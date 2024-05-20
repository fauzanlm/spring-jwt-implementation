package com.fauzanlm.jwtimpl.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fauzanlm.jwtimpl.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

}
