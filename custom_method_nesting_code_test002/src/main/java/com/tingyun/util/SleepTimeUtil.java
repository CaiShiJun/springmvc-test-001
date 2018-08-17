package com.tingyun.util;

public class SleepTimeUtil {

    public static void sleep(int millisecond){
        try {
            Thread.sleep(millisecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
