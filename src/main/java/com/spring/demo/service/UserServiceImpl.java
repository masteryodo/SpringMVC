package com.spring.demo.service;

import com.spring.demo.dao.*;
import com.spring.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class UserServiceImpl implements UserService
{
    @Autowired
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO)
    {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public void addUser(User user)
    {

    }

    @Override
    @Transactional
    public void removeUser(User user)
    {

    }

    @Override
    @Transactional
    public User getUserById(Long id)
    {
        return null;
    }
}
