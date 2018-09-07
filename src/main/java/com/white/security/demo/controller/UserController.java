package com.white.security.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * All rights Reserved, Designed by xxxx
 *
 * @Author: White
 * @Date: 2018/9/6
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @GetMapping
    public String getUsers() {
        return "Hello Spring Security";
    }
}
