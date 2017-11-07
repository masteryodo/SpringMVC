package com.spring.demo.service;

import com.spring.demo.model.User;

public interface UserService
{
    void addUser(User user);

    void removeUser(User user);

    User getUserById(Long id);
}
