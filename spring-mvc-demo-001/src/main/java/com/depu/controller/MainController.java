package com.depu.controller;

import com.depu.service.HhqmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * Created by dzkan on 2016/3/8.
 */
@Controller
public class MainController {

    @Autowired
    private HhqmService hhqmService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/hhqm", method = RequestMethod.GET)
    public String hhqm() {
        return "hhqm";
    }

    // http://localhost:8080/getRandomStr
    @RequestMapping(value = "/getRandomStr", method = RequestMethod.GET)
    @ResponseBody
    public String getRandomStr(){

        String[] key ={"Almond","Apple","Apricot","Arbutus","Banana","Casaba","Haw","Lemon","Mango","Pear"};
        Random random = new Random();
        int index = random.nextInt(key.length-1);
        System.out.println(index);
        return key[index];
    }

    // http://localhost:8080/getRandomIntrtr
    @RequestMapping(value = "/getRandomInt")
    @ResponseBody
    public String getRandomInt(int bound){
        return hhqmService.getRandomInt(bound);
    }

    @RequestMapping(value = "/getRestFul1Get/{id}",method=RequestMethod.GET)
    @ResponseBody
    public String getRestFul1Get(@PathVariable("id") Integer id){
        String result = "GET："+id;
        System.out.println(result);
        return result;
    }

    @RequestMapping(value = "/getRestFul1Post/{id}",method=RequestMethod.POST)
    @ResponseBody
    public String getRestFul1Post(@PathVariable("id") Integer id){
        String result = "POST："+id;
        System.out.println(result);
        return result;
    }

    @RequestMapping(value = "/getRestFul1Delete/{id}",method=RequestMethod.DELETE)
    @ResponseBody
    public String getRestFul1Delete(@PathVariable("id") Integer id){
        String result = "DELETE："+id;
        System.out.println(result);
        return result;
    }

    @RequestMapping(value = "/getRestFul1Put/{id}",method=RequestMethod.PUT)
    @ResponseBody
    public String getRestFul1Put(@PathVariable("id") Integer id){
        String result = "PUT："+id;
        System.out.println(result);
        return result;
    }


}