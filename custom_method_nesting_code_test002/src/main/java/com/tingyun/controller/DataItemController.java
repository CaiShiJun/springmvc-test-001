package com.tingyun.controller;

import com.tingyun.bean.Person;
import com.tingyun.bean.spring.SpringComponentBean;
import com.tingyun.util.SleepTimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
@RequestMapping("/DataItemController")
public class DataItemController {

    @Autowired
    private SpringComponentBean springComponentBean;

    private static final Random random = new Random();
    private static int remainder = 0;


    @RequestMapping("/paramShortReturnByteMapping")
    @ResponseBody
    public String paramShortReturnByteMapping(Short param){
        SleepTimeUtil.sleep(1000);
        return "param:"+param+"        Return:"+paramShortReturnByte(param);
    }

    //参数类型为 short ，返回值类型为 byte
    public byte paramShortReturnByte(short param){
        System.out.println("public byte simpleType(short param)："+param);
        return (byte) (param%127);
    }


    @RequestMapping("/paramBooleanReturnDoubleMapping")
    @ResponseBody
    public String paramBooleanReturnDoubleMapping(Boolean param){
        SleepTimeUtil.sleep(1000);
        return "param:"+param+"        Return:"+paramBooleanReturnDouble(param);
    }

    //参数类型为 boolean ，返回值类型为 double
    public double paramBooleanReturnDouble(boolean param){
        System.out.println("public double simpleType(boolean param)："+param);
        return random.nextDouble();
    }


    @RequestMapping("/paramIntReturnShortMapping")
    @ResponseBody
    public String paramIntReturnShortMapping(Integer param){
        SleepTimeUtil.sleep(1000);
        return "param:"+param+"        Return:"+paramIntReturnShort(param);
    }

    //参数类型为 int ，返回值类型为 short
    public short paramIntReturnShort(int param){
        System.out.println("public short simpleType(int param)："+param);
        return (short) (param%32767);
    }


    @RequestMapping("/paramLongReturnIntMapping")
    @ResponseBody
    public String paramLongReturnIntMapping(Long param){
        SleepTimeUtil.sleep(1000);
        return "param:"+param+"        Return:"+paramLongReturnInt(param);
    }

    //参数类型为 long ，返回值类型为 int
    public int paramLongReturnInt(long param){
        System.out.println("public int simpleType(long param)："+param);
        return (int) (param%2147483647);
    }


    @RequestMapping("/paramFloatReturnLongMapping")
    @ResponseBody
    public String paramFloatReturnLongMapping(Float param){
        SleepTimeUtil.sleep(1000);
        return "param:"+param+"        Return:"+paramFloatReturnLong(param);
    }

    //参数类型为 float ，返回值类型为 long
    public long paramFloatReturnLong(float param){
        System.out.println("public long simpleType(float param)："+param);
        return (long) param;
    }


    @RequestMapping("/paramIntReturnCharMapping")
    @ResponseBody
    public String paramIntReturnCharMapping(Integer param){
        SleepTimeUtil.sleep(1000);
        return "param:"+param+"        Return:"+paramIntReturnChar(param);
    }

    //参数类型为 int ，返回值类型为 char
    public char paramIntReturnChar(int param){
        System.out.println("public char simpleType(byte param)："+param);
        return (char) param;
    }


    @RequestMapping("/paramDoubleReturnFloatMapping")
    @ResponseBody
    public String paramDoubleReturnFloatMapping(Double param){
        SleepTimeUtil.sleep(1000);
        return "param:"+param+"        Return:"+paramDoubleReturnFloat(param);
    }

    //参数类型为 double ，返回值类型为 float
    public float paramDoubleReturnFloat(double param){
        System.out.println("public float simpleType(double param)："+param);
        return (float) param;
    }


    @RequestMapping("/paramObjectReturnVoidMapping")
    @ResponseBody
    public String paramObjectReturnVoidMapping(Person person){
        SleepTimeUtil.sleep(1000);
        paramObjectReturnVoid(person);
        return "param:"+person+"        Return:"+"Void";
    }

    //参数类型为 Object，返回值类型为 void
    public void paramObjectReturnVoid(Object param){
        System.out.println(param.hashCode());
    }


    @RequestMapping("/paramCharReturnBooleanMapping")
    @ResponseBody
    public String paramCharReturnBooleanMapping(Character param){
        SleepTimeUtil.sleep(1000);
        return "param:"+param+"        Return:"+paramCharReturnBoolean(param);
    }

    //参数类型为 char ，返回值类型为 boolean
    public boolean paramCharReturnBoolean(char param){
        System.out.println("public boolean simpleType(char param)："+param);
        return random.nextBoolean();
    }


    @RequestMapping("/paramByteReturnCharMapping")
    @ResponseBody
    public String paramByteReturnCharMapping(Byte param){
        SleepTimeUtil.sleep(1000);
        return "param:"+param+"        Return:"+paramByteReturnChar(param);
    }

    //参数类型为 byte ，返回值类型为 char
    public char paramByteReturnChar(byte param){
        System.out.println("public char simpleType(byte param)："+param);
        return (char) param;
    }


    @RequestMapping("/paramClassReturnExceptionMapping")
    @ResponseBody
    public String paramClassReturnExceptionMapping() throws Exception {
        SleepTimeUtil.sleep(1000);
        Class param = DataItemController.class;
        return "param:"+param.getName()+"        Return:"+paramClassReturnException(param).getMessage();
    }

    //参数类型为 Class，返回值类型为 Exception 类型
    public Exception paramClassReturnException(Class clazz)throws Exception{
        System.out.println(clazz.toString());
        System.out.println(new Exception().getStackTrace().toString());
        return new Exception("paramClassReturnException");
    }


    @RequestMapping("/paramAutowiredBeanReturnLongMapping")
    @ResponseBody
    public String paramAutowiredBeanReturnLongMapping() throws Exception {
        SleepTimeUtil.sleep(1000);
        return "param:"+springComponentBean+"        Return:"+paramAutowiredBeanReturnLong(springComponentBean);
    }

    //参数类型为Autowired注入的Spring维护的Bean，返回值为Long类型
    public Long paramAutowiredBeanReturnLong(SpringComponentBean springComponentBean){
        System.out.println(springComponentBean.getSpringComponentPerson().getContact().getPhoneNumber());
        return 1000000000L;
    }

    @RequestMapping("/paramDoubleReturnAutowiredBeanMapping")
    @ResponseBody
    public String paramDoubleReturnAutowiredBeanMapping(Double param){
        SleepTimeUtil.sleep(1000);
        return "param:"+param+"        Return:"+paramDoubleReturnAutowiredBean(param);
    }

    //参数类型为Double，返回值类型为Autowired注入的Spring维护的Bean
    public SpringComponentBean paramDoubleReturnAutowiredBean(Double paramDouble){
        System.out.println(paramDouble);
        return springComponentBean;
    }

    @RequestMapping("/multiParameterMultiTypeMapping")
    @ResponseBody
    public String multiParameterMultiTypeMapping(Integer paramInt,Person paramPerson,String paramStr) throws Exception {
        SleepTimeUtil.sleep(1000);
        return "param:"+paramInt+paramPerson+paramStr+"        Return:"+multiParameterMultiType(paramInt,paramPerson,paramStr);
    }

    //多参数多类型测试
    public Person multiParameterMultiType(int paramInt,Person paramPerson,String paramStr){
        System.out.println(paramInt);
        System.out.println(paramPerson);
        System.out.println(paramStr);
        return paramPerson;
    }

}
