package com.example.authenticationDemo.authDemo.service;

import com.example.authenticationDemo.authDemo.domain.User;
import com.example.authenticationDemo.authDemo.exception.UserNotFoundException;

import java.util.List;

public interface UserService {
    public User addUser(User user);
    public User findByUserNameAndPassword(String userName,String password) throws UserNotFoundException;
    List<User> getAllUser();

    boolean deleteUser(int userId) throws UserNotFoundException;


}
