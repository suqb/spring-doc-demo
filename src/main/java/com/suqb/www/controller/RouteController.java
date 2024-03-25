package com.suqb.www.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页控制器
 */
@RequestMapping("/index")
@RestController
public class RouteController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
