package com.tingyun.controller;

import com.tingyun.bean.Contact;
import com.tingyun.bean.Person;
import com.tingyun.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
@RequestMapping("/CustomMethodController")
public class CustomMethodController {

    @Autowired
    private TestMapper testMapper;

    @RequestMapping("/doCustomMethod")
    @ResponseBody
    public String doCustomMethod(){
        Random random = new Random();

        Person person = new Person();
        person.setId(random.nextInt());
        person.setAge(25);
        Contact contact = new Contact();
        contact.setEmail("caisj@tingyun.com");
        contact.setPhoneNumber("123123121");
        contact.setQqNumber("1231231312");
        person.setContact(contact);

        return setPerson(person);
    }

    public String setPerson(Person person){
        int result = testMapper.insertTestUser(person);
        return "success:"+result;
    }

}


