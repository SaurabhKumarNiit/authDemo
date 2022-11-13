package com.example.authenticationDemo.authDemo.repository;

import com.example.authenticationDemo.authDemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Integer>
{
public User findByUserNameAndPassword(String username,String password);
}
