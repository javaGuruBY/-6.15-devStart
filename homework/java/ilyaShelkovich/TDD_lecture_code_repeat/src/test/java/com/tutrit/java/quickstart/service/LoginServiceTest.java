package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginServiceTest {

    LoginService loginService;
    User user;
    User blockedUser;
    String positiveUserInput = "password";
    String negativeUserInput = "wrong";


    @Before
    public void setUp() {
        this.loginService = new LoginService();
        this.user = getUser();
        this.blockedUser = getBlockedUser();

        Assert.assertEquals(3, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());

        Assert.assertEquals(0, blockedUser.getLoginAttempts());
        Assert.assertTrue(blockedUser.isBlocked());
    }

    @Test
    public void checkUserPasswordPositive() {
        boolean actualResult = loginService.checkUserPassword(user, positiveUserInput);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void checkUserPasswordNegative() {
        boolean actualResult = loginService.checkUserPassword(user, negativeUserInput);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void reduceLoginAttempts() {
        loginService.reduceLoginAttempts(user);
        Assert.assertEquals(2, user.getLoginAttempts());
    }

    @Test
    public void loginPositive() {
        boolean actualResult = loginService.login(user, positiveUserInput);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void loginNegative() {
        boolean actualResult = loginService.login(user,negativeUserInput);
        Assert.assertFalse(actualResult);
        Assert.assertEquals(2, user.getLoginAttempts());
    }

    @Test
    public void blockUser() {
        loginService.blockUser(user);
        Assert.assertTrue(user.isBlocked());
    }

    @Test
    public void after3wrongPasswords_ShouldBlockUser() {
        loginService.login(user, negativeUserInput);
        Assert.assertEquals(2, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());

        loginService.login(user, negativeUserInput);
        Assert.assertEquals(1, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());

        loginService.login(user, negativeUserInput);
        Assert.assertEquals(0, user.getLoginAttempts());
        Assert.assertTrue(user.isBlocked());
    }

    @Test
    public void blockedUserLogin_ShouldReturnFalse(){
        boolean actualResult = loginService.login(blockedUser, positiveUserInput);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void restoreAttempts(){
        user.setLoginAttempts(1);
        loginService.restoreAttempts(user);
        Assert.assertEquals(3, user.getLoginAttempts());
    }

    @Test
    public void after1Incorrect_ShouldRestoreAttempts(){
        loginService.login(user, negativeUserInput);
        loginService.login(user, positiveUserInput);
        Assert.assertEquals(3, user.getLoginAttempts());
    }

    @Test
    public void after2Incorrect_ShouldRestoreAttempts(){
        loginService.login(user, negativeUserInput);
        loginService.login(user, negativeUserInput);
        loginService.login(user, positiveUserInput);
        Assert.assertEquals(3, user.getLoginAttempts());
    }

    @Test
    public void after3Incorrect_ShouldRestoreAttempts(){
        loginService.login(user, negativeUserInput);
        loginService.login(user, negativeUserInput);
        loginService.login(user, negativeUserInput);
        boolean actualResult = loginService.login(user, positiveUserInput);
        Assert.assertEquals(0, user.getLoginAttempts());
        Assert.assertTrue(user.isBlocked());
        Assert.assertFalse(actualResult);
    }

    private User getUser() {
        User user = new User();
        user.setPassword("password");
        return user;
    }

    private User getBlockedUser() {
        User user = new User();
        user.setPassword("password");
        user.setLoginAttempts(0);
        user.setBlocked(true);
        return user;
    }
}
