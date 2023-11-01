package com.example.utkarsh_Singh.Backend.repository;

import com.example.utkarsh_Singh.Backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
