package com.spring.demo.dao;

import com.spring.demo.entity.User;
import org.hibernate.*;
import org.slf4j.*;

public class UserDAOImpl implements UserDAO
{
    private static final Logger logger = LoggerFactory.getLogger(PhoneDAOImpl.class);
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf)
    {
        this.sessionFactory = sf;
    }

    @Override
    public User getUserById(long id)
    {
        Session session = this.sessionFactory.getCurrentSession();
        User user = (User)session.load(User.class, id);
        logger.info("User loaded successfully, User details="+ user);
        return user;
    }

    @Override
    public User getUserByName(String name)
    {
        Query query = this.sessionFactory.getCurrentSession().createQuery("from USERS where name=:name");
        query.setParameter("name", name);
        User user = (User)query.uniqueResult();
        logger.info("User loaded successfully, User details="+ user);
        return user;
    }
}
