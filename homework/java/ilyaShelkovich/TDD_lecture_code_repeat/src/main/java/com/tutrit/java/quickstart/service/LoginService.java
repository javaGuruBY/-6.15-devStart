package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.User;

public class LoginService {
    public boolean checkUserPassword(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }
}
