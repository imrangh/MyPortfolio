package com.payroll.controller;

import com.payroll.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class UserController {
    @Autowired
    UserEntity userEntity;

    @GetMapping("/data")
    public UserEntity getUserEntity(){
        return userEntity;
    }
}
