package com.example.profile_ltdtdd;

public class User {
    public String username,pass;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public User(String username, String pass) {
        this.username = username;
        this.pass = pass;
    }
}
