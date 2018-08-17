package com.tingyun.bean.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringComponentPerson {

    private int id;
    private String name="SpringComponentPersonName";
    private int age = 123;

    @Autowired
    private SpringComponentContact springComponentContact;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SpringComponentContact getContact() {
        return springComponentContact;
    }

    public void setContact(SpringComponentContact contact) {
        this.springComponentContact = contact;
    }

    @Override
    public String toString() {
        return "SpringComponentPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", springComponentContact=" + springComponentContact +
                '}';
    }
}
