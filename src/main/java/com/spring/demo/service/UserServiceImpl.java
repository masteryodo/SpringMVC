package com.spring.demo.service;

import com.spring.demo.dao.*;
import com.spring.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService
{
    @Autowired
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO)
    {
        this.userDAO = userDAO;
    }

    @Override
    public User getUser(String login)
    {
        return userDAO.getUserByName(login);
    }

    @Override
    public List<User> listUsers()
    {
        return null;
    }
}
