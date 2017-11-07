package com.spring.demo.dao;

import com.spring.demo.model.User;

import java.util.List;

public interface UserDAO
{
    void addUser(User user);

    void updateUser(User user);

    List<User> listUsers();

    User getUserById(long id);

    void removeUser(long id);
}
