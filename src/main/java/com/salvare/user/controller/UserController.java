package com.salvare.user.controller;

import com.salvare.user.mapper.UserMapper;
import com.salvare.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("list")
    public List<User> list() {
        List<User> users = userMapper.selectAll();
        return users;
    }


    @GetMapping("get")
    public User get(int id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @PostMapping("create")
    public int create(@RequestBody User user) {
        int result = userMapper.insert(user);
        return result;
    }

    @PostMapping("drop")
    public int drop(int id) {
        int result = userMapper.deleteByPrimaryKey(id);
        return result;
    }

}
