package com.example.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController{
    @Value("${spring.application.name}") //Reads a val. from your Spring Boot config(app.properties) and stores it in a Java variable-appName.
    private String appName;

    @RequestMapping("/")
    public String index(){
        return "index.html";
    }
}