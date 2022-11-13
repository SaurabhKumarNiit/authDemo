package com.example.authenticationDemo.authDemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "User Not Found Please Check")
public class UserNotFoundException extends Exception {

}
