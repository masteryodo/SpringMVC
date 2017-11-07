package com.spring.demo.dao;

import com.spring.demo.model.User;
import org.hibernate.SessionFactory;
import org.slf4j.*;

import java.util.List;

public class UserDAOImpl implements UserDAO
{
    private static final Logger logger = LoggerFactory.getLogger(PhoneDAOImpl.class);
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf)
    {
        this.sessionFactory = sf;
    }

    @Override
    public void addUser(User user)
    {

    }

    @Override
    public void updateUser(User user)
    {

    }

    @Override
    public List<User> listUsers()
    {
        return null;
    }

    @Override
    public User getUserById(long id)
    {
        return null;
    }

    @Override
    public void removeUser(long id)
    {

    }
}
