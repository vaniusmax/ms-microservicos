package com.vaniusmax.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaniusmax.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
