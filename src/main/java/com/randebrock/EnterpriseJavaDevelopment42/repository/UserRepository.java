package com.randebrock.EnterpriseJavaDevelopment42.repository;

//import com.example.demosecurityjwt.model.User;
//import org.springframework.data.jpa.repository.JpaRepository;
import com.randebrock.EnterpriseJavaDevelopment42.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
