package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginServiceTest {

    LoginService loginService;

    @Before
    public void setUp(){
        this.loginService = new LoginService();
    }

    @Test
    public void checkUserPasswordPositive(){
        User user = getUser();

        String userInput = "password";


        boolean actualResult = loginService.checkUserPassword(user, userInput);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void checkUserPasswordNegative(){
        User user = getUser();

        String userInput = "wrong";


        boolean actualResult = loginService.checkUserPassword(user, userInput);
        Assert.assertFalse(actualResult);
    }


    private User getUser() {
        User user = new User();
        user.setPassword("password");
        return user;
    }

}
