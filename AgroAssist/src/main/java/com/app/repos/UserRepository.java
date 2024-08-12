package com.app.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public User findByEmail(String email);
	public User findByEmailAndPassword(String email, String password);
}
