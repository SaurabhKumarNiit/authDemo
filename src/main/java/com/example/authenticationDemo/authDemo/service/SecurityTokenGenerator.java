package com.example.authenticationDemo.authDemo.service;

import com.example.authenticationDemo.authDemo.domain.User;

import java.util.Map;

public interface SecurityTokenGenerator
{
    Map<String,String> generateToken(User user);
}
