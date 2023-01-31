package com.leven.spring.controller;

import com.leven.spring.pojo.User;
import com.leven.spring.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/all")
    List<User> getAll(){
        List<User> users = userService.getAll();
        return users;
    }

    @GetMapping("/userbyid/{userid}")
    String getUserById(@PathVariable("userid") Integer id){
        User user = userService.getUserById(id);
        System.out.println(user);
        return "请求Id 是:" + id;
    }

    @GetMapping("/userbyname/{name}")
    String getUserByName(@PathVariable("name") String name){
        User user = userService.getUserByName(name);
        System.out.println(user);
        return "请求name 是:" + name;
    }

}

