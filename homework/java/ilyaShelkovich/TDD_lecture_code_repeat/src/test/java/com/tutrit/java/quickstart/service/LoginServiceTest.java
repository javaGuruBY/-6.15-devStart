package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginServiceTest {

    LoginService loginService;
    User user;

    @Before
    public void setUp(){
        this.loginService = new LoginService();
        this.user = getUser();
        Assert.assertEquals(3, user.getLoginAttempts());
    }

    @Test
    public void checkUserPasswordPositive(){
        String userInput = "password";

        boolean actualResult = loginService.checkUserPassword(user, userInput);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void checkUserPasswordNegative(){
        String userInput = "wrong";

        boolean actualResult = loginService.checkUserPassword(user, userInput);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void reduceLoginAttempts(){
        loginService.reduceLoginAttempts(user);
        Assert.assertEquals(2, user.getLoginAttempts());
    }

    @Test
    public void loginPositive(){
        String userInput = "password";

        boolean actualResult = loginService.login(user, userInput);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void loginNegative(){
        String userInput = "wrong";

        boolean actualResult = loginService.login(user, userInput);
        Assert.assertFalse(actualResult);
        Assert.assertEquals(2, user.getLoginAttempts());
    }

    private User getUser() {
        User user = new User();
        user.setPassword("password");
        return user;
    }
}
