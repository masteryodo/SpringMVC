package com.spring.demo.controllers;

import com.spring.demo.model.Phone;
import com.spring.demo.service.PhoneService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PhoneController
{
    private PhoneService phoneService;

    @Autowired(required = true)
    @Qualifier(value = "phoneService")
    public void setPhoneService(PhoneService phoneService)
    {
        this.phoneService = phoneService;
    }

    @RequestMapping(value = "/phones", method = RequestMethod.GET)
    public String listPhones(Model model)
    {
        model.addAttribute("phone", new Phone());
        model.addAttribute("listPhones", this.phoneService.listPhones());
        return "phone";
    }

// For add and update phone both
    @RequestMapping(value = "/phone/add", method = RequestMethod.POST)
    public String addPhone(@ModelAttribute("phone") Phone phone)
    {
        if (phone.getId() == 0)
        {
// new phone, add it
            this.phoneService.addPhone(phone);
        }
        else
        {
// existing phone, call update
            this.phoneService.updatePhone(phone);
        }
        return "redirect:/phones";
    }

    @RequestMapping("/remove/{id}")
    public String removePhone(@PathVariable("id") int id)
    {
        this.phoneService.removePhone(id);
        return "redirect:/phones";
    }

    @RequestMapping("/edit/{id}")
    public String editPhone(@PathVariable("id") int id, Model model)
    {
        model.addAttribute("phone", this.phoneService.getPhoneById(id));
        model.addAttribute("listPhones", this.phoneService.listPhones());
        return "phone";
    }
}