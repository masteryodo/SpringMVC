package com.spring.demo.service;

import com.spring.demo.dao.PhoneDAO;
import com.spring.demo.model.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService
{
    @Autowired
    private PhoneDAO phoneDAO;

    public void setPhoneDAO(PhoneDAO phoneDAO)
    {
        this.phoneDAO = phoneDAO;
    }

    @Override
    @Transactional
    public void addPhone(Phone p)
    {
        this.phoneDAO.addPhone(p);
    }

    @Override
    @Transactional
    public void updatePhone(Phone p)
    {
        this.phoneDAO.updatePhone(p);
    }

    @Override
    @Transactional
    public List<Phone> listPhones()
    {
        return this.phoneDAO.listPhones();
    }

    @Override
    @Transactional
    public Phone getPhoneById(int id)
    {
        return this.phoneDAO.getPhoneById(id);
    }

    @Override
    @Transactional
    public void removePhone(int id)
    {
        this.phoneDAO.removePhone(id);
    }
}
