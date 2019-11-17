package com.gajula.learning.jpa.jpastarter.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gajula.learning.jpa.jpastarter.entity.User;

/**
 *  
 *  Spring Data JPA
 *
 */

public interface UserRepository extends JpaRepository<User, Long>{

}
