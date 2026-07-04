package com.example.store;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
@Lazy
public class HeavyResource {
    public HeavyResource() {
        System.out.println("HeavyResource created");
    }
}
