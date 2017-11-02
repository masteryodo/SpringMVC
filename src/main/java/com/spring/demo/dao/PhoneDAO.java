package com.spring.demo.dao;

import com.spring.demo.model.Phone;

import java.util.List;

public interface PhoneDAO
{
    void addPhone(Phone p);

    void updatePhone(Phone p);

    List<Phone> listPhones();

    Phone getPhoneById(int id);

    void removePhone(int id);
}