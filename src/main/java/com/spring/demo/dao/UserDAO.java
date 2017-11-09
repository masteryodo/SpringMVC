package com.spring.demo.dao;

import com.spring.demo.entity.User;

import java.util.List;

public interface UserDAO
{
    User getUserById(long id);

    User getUserByName(String name);
}
