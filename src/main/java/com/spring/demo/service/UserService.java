package com.spring.demo.service;

import com.spring.demo.entity.User;

import java.util.List;

public interface UserService
{
    User getUser(String login);

    List<User> listUsers();
}
