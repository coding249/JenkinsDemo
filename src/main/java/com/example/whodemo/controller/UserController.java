package com.example.whodemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.whodemo.dao.UserDao;
import com.example.whodemo.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userRepository;

    @RequestMapping("/listall")
    public List<User> findAll() {
        List<User> list = new ArrayList<User>();
        list = userRepository.findAll();
        return list;
    }

    @RequestMapping("/list")
    @ResponseBody
    public User getByUserName(String userName) {
        User user = userRepository.findByUserName(userName);
        return user;
    }

    @GetMapping("/test")
    public String myTest() {
        String text = "神光护体，永无bug！";
        return text;
    }

}