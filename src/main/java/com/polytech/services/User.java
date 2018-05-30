package com.polytech.services;

/**
 * Created by Guillaume Bardet on 30/05/2018.
 */
public class User {
    private String username;
    private String password;
    private boolean enabled = true;


    public User() {}

    public boolean isEnabled() {
        return enabled;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
