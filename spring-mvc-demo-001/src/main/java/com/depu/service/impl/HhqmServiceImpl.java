package com.depu.service.impl;

import com.depu.service.HhqmService;
import org.springframework.stereotype.Service;

import java.util.Random;
@Service
public class HhqmServiceImpl implements HhqmService {

    @Override
    public String getRandomInt(int bound){
        Random random = new Random();
        Integer i = random.nextInt(bound);
        return i.toString();
    }

}
