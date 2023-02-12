package com.randebrock.EnterpriseJavaDevelopment42.repository;

//import com.example.demosecurityjwt.model.Role;
//import org.springframework.data.jpa.repository.JpaRepository;
import com.randebrock.EnterpriseJavaDevelopment42.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
}
