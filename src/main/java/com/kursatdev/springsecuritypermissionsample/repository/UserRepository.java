package com.kursatdev.springsecuritypermissionsample.repository;

import com.kursatdev.springsecuritypermissionsample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {  
  Optional<User> findByEmail(String email);
}
