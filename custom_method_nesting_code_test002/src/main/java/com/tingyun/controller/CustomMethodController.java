package com.tingyun.controller;

import com.tingyun.bean.Contact;
import com.tingyun.bean.Person;
import com.tingyun.bean.spring.SpringComponentBean;
import com.tingyun.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;


@Controller
@RequestMapping("/CustomMethodController")
public class CustomMethodController {

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private SpringComponentBean springComponentBean;

    @RequestMapping("/custom001")
    @ResponseBody
    public String custom001(){
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

    //传入简单类型返回简单类型
    @RequestMapping("/custom002")
    @ResponseBody
    public String custom002()throws Exception{

        //参数类型为 short ，返回值类型为 byte
        System.out.println(simpleType(new Short("13")));
        //参数类型为 boolean ，返回值类型为 double
        System.out.println(simpleType(true));
        //参数类型为 float ，返回值类型为 long
        System.out.println(simpleType(23131231.1231321F));
        //参数类型为 int ，返回值类型为 char
        System.out.println(intInCharOut(76));
        //参数类型为 Object，返回值类型为 void
        objectInVoidOut(new Person());
        //参数类型为 Class，返回值类型为 Exception 类型
        classInExceptionOut(this.getClass());
        //参数类型为Autowired注入的Spring维护的Bean，返回值为Long类型
        autowiredInLongOut(springComponentBean);
        //参数类型为Double，返回值类型为Autowired注入的Spring维护的Bean
        doubleInAutowiredOut(32113212.32131);
        //多参数多类型测试
        Random random = new Random();
        Person person = new Person();
        person.setId(random.nextInt());
        person.setAge(25);
        Contact contact = new Contact();
        contact.setEmail("caisj@tingyun.com");
        contact.setPhoneNumber("123123121");
        contact.setQqNumber("1231231312");
        person.setContact(contact);
        manyParamTest(123,person,"manyParamTest_paramStr");
        return "success";
    }

    //参数类型为 int ，返回值类型为 char
    public char intInCharOut(int param){
        System.out.println("public char simpleType(byte param)："+param);
        return 76;
    }

    //参数类型为 short ，返回值类型为 byte
    public byte simpleType(short param){
        System.out.println("public byte simpleType(short param)："+param);
        return 12;
    }
    public short simpleType(int param){
        System.out.println("public short simpleType(int param)："+param);
        return 123;
    }
    public int simpleType(long param){
        System.out.println("public int simpleType(long param)："+param);
        return 1234;
    }

    //参数类型为 float ，返回值类型为 long
    public long simpleType(float param){
        System.out.println("public long simpleType(float param)："+param);
        return 12345L;
    }

    //参数类型为 double ，返回值类型为 float
    public float simpleType(double param){
        System.out.println("public float simpleType(double param)："+param);
        return 12345.6F;
    }

    //参数类型为 boolean ，返回值类型为 double
    public double simpleType(boolean param){
        System.out.println("public double simpleType(boolean param)："+param);
        return 12345.67;
    }
    public boolean simpleType(char param){
        System.out.println("public boolean simpleType(char param)："+param);
        return true;
    }
    public char simpleType(byte param){
        System.out.println("public char simpleType(byte param)："+param);
        return 12;
    }


    //传入Set类型返回List类型
    @RequestMapping("/custom003")
    @ResponseBody
    public String custom003(){
        Set<Person> personSet = new HashSet<>();
        for(int i = 0;i<3;i++){
            Random random = new Random();
            Person person = new Person();
            person.setId(random.nextInt());
            person.setAge(25);
            Contact contact = new Contact();
            contact.setEmail("caisj@tingyun.com");
            contact.setPhoneNumber("123123121");
            contact.setQqNumber("1231231312");
            person.setContact(contact);

            personSet.add(person);
        }
        List<Person> personList = getPersonList(personSet);
        System.out.println(personList);
        return "success";
}

    public List<Person> getPersonList(Set<Person> personSet){
        System.out.println(personSet.iterator().next().getContact().getEmail());
        List<Person> personList = new ArrayList<>(personSet);
        personList.iterator().next().getContact().getEmail();
        return personList;
    }


    @RequestMapping("/custom004")
    @ResponseBody
    public String custom004() throws Exception {
        classInExceptionOut(this.getClass());
        return "success";
    }

    //参数类型为 Class，返回值类型为 Exception 类型
    public Exception classInExceptionOut(Class clazz)throws Exception{
        System.out.println(clazz.getName());
        System.out.println(new Exception().getStackTrace().toString());
        return new Exception();
    }



    @RequestMapping("/custom005")
    @ResponseBody
    public String custom005() throws Exception {
        objectInVoidOut(new Person());
        return "success";
    }

    //参数类型为 Object，返回值类型为 void
    public void objectInVoidOut(Object param){
        System.out.println(param.hashCode());
    }


    @RequestMapping("/custom006")
    @ResponseBody
    public String custom006() throws Exception {
        Random random = new Random();
        Person person = new Person();
        person.setId(random.nextInt());
        person.setAge(25);
        Contact contact = new Contact();
        contact.setEmail("caisj@tingyun.com");
        contact.setPhoneNumber("123123121");
        contact.setQqNumber("1231231312");
        person.setContact(contact);

        manyParamTest(123,person,"manyParamTest_paramStr");
        return "success";
    }


    //多参数多类型测试
    public Person manyParamTest(int paramInt,Person paramPerson,String paramStr){
        System.out.println(paramInt);
        System.out.println(paramPerson);
        System.out.println(paramStr);
        return paramPerson;
    }


    @RequestMapping("/custom007")
    @ResponseBody
    public String custom007() throws Exception {
        //System.out.println(autowiredInLongOut(springComponentBean));
        //autowiredInLongOut(null);
        springComponentBean.setSpringComponentPerson(null);
        autowiredInLongOut(springComponentBean);
        return "success";
    }

    //参数类型为Autowired注入的Spring维护的Bean，返回值为Long类型
    public Long autowiredInLongOut(SpringComponentBean springComponentBean){
        //System.out.println(springComponentBean.getSpringComponentPerson().getContact().getPhoneNumber());
        return 21431243213L;
    }


    @RequestMapping("/custom008")
    @ResponseBody
    public String custom008() throws Exception {
        doubleInAutowiredOut(32113212.32131);
        return "success";
    }

    //参数类型为Double，返回值类型为Autowired注入的Spring维护的Bean
    public SpringComponentBean doubleInAutowiredOut(Double paramDouble)throws Exception {
        System.out.println(paramDouble);
        return springComponentBean;
    }


    @RequestMapping("/custom009")
    @ResponseBody
    public String custom009() throws Exception {
        Random random = new Random();
        Person person = new Person();
        person.setId(random.nextInt());
        person.setAge(25);
        Contact contact = new Contact();
        contact.setEmail("caisj@tingyun.com");
        contact.setPhoneNumber("123123121");
        contact.setQqNumber("1231231312");
        person.setContact(contact);

        personArrayInStringArrayOut(new Person[]{person,person,person,person,person});
        return "success";
    }

    //参数类型为int数组，返回值类型为String数组
    public String[] personArrayInStringArrayOut(Person[] personArray){
        return new String[]{"string0","string1","string2","string3"};
    }



}


