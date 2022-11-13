package com.example.authenticationDemo.authDemo.service;

import com.example.authenticationDemo.authDemo.domain.User;
import com.example.authenticationDemo.authDemo.exception.UserNotFoundException;
import com.example.authenticationDemo.authDemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl (UserRepository userRepository){
        this.userRepository=userRepository;
    }
    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findByUserNameAndPassword(String userName, String password) throws UserNotFoundException {
        User user=userRepository.findByUserNameAndPassword(userName,password);
        if(user==null){
            throw new UserNotFoundException();
        }

        return user;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public boolean deleteUser(int userId) throws UserNotFoundException{
        boolean result=false;
        if(userRepository.findById(userId).isEmpty()){

            throw new UserNotFoundException();

        }else {userRepository.deleteById(userId);result= true;}

        return result;
    }
}
