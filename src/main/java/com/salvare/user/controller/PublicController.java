package com.salvare.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("public")
public class PublicController {

    @RequestMapping("welcome")
    public String welcome() {
        return  "welcome user module!";
    }

    @RequestMapping("login")
    public String login() {
        return  "login user module!";
    }

}
