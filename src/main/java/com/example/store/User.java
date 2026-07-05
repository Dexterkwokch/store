package com.example.store;

public class User {
    private Long id;
    private String email;
    private String password;
    private String Name;

    public User(Long id, String email, String password, String Name) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.Name = Name;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }

    
}
