package com.alexandrefirstproject.user_registration.model;

import java.time.LocalDateTime;

public class User {
    private Long id;
    private String name;
    private String email;
//    private Integer years; / talvez implemente para que menores não se cadastre.
    private String password;
    private LocalDateTime createdAt;

    public User(String alex, String mail, int i, String number){}

    public User(String name, String email,String password){
        this.name = name;
        this.email = email;
        this.password = password;
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "id = " + id +
                ", name = " + name +
                ", email = " + email +
                ", password = " + password +
                ", createdAt = " + createdAt;
    }
}
