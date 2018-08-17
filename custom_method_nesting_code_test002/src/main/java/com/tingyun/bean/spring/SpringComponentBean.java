package com.tingyun.bean.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringComponentBean {

    @Autowired
    SpringComponentPerson springComponentPerson;

    public SpringComponentPerson getSpringComponentPerson() {
        return springComponentPerson;
    }

    public void setSpringComponentPerson(SpringComponentPerson springComponentPerson) {
        this.springComponentPerson = springComponentPerson;
    }

    @Override
    public String toString() {
        return "SpringComponentBean{" +
                "springComponentPerson=" + springComponentPerson +
                '}';
    }
}
