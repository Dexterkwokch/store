package com.example.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Application name: " + appName;
    }
}