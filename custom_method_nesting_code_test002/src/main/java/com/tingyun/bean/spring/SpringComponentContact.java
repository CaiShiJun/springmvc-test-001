package com.tingyun.bean.spring;

import org.springframework.stereotype.Component;

@Component
public class SpringComponentContact {

    private String phoneNumber = "SpringComponentContact_phoneNumber";
    private String email = "SpringComponentContact_email";
    private String qqNumber = "SpringComponentContact_qqNumber";

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQqNumber() {
        return qqNumber;
    }

    public void setQqNumber(String qqNumber) {
        this.qqNumber = qqNumber;
    }
}
