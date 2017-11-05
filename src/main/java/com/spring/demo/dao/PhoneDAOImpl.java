package com.spring.demo.dao;

import com.spring.demo.model.Phone;
import org.hibernate.*;
import org.slf4j.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PhoneDAOImpl implements PhoneDAO
{
    private static final Logger logger = LoggerFactory.getLogger(PhoneDAOImpl.class);
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf)
    {
        this.sessionFactory = sf;
    }

    @Override
    public void addPhone(Phone p)
    {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("Phone saved successfully, Phone Details=" + p);
    }

    @Override
    public void updatePhone(Phone p)
    {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(p);
        logger.info("Phone updated successfully, Phone Details=" + p);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Phone> listPhones()
    {
        Session session = this.sessionFactory.getCurrentSession();
        List<Phone> phonesList = session.createQuery("from Phone").list();
        for (Phone p : phonesList)
        {
            logger.info("Phone List::" + p);
        }
        return phonesList;
    }

    @Override
    public Phone getPhoneById(int id)
    {
        Session session = this.sessionFactory.getCurrentSession();
        Phone phone = (Phone)session.load(Phone.class, new Integer(id));
        logger.info("Phone loaded successfully, Phone details="+ phone);
        return phone;
    }

    @Override
    public void removePhone(int id)
    {
        Session session = this.sessionFactory.getCurrentSession();
        Phone phone = (Phone)session.load(Phone.class, new Integer(id));
        if (null != phone)
        {
            session.delete(phone);
        }
        logger.info("Phone deleted successfully, phone details=" + phone);
    }
}
