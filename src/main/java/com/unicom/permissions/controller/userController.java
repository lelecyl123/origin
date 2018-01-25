package com.unicom.permissions.controller;

import com.unicom.permissions.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class userController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/hello")
    public Map hello(long id){
        System.out.println("xxx");
        return userService.likeName(id);
    }
}
