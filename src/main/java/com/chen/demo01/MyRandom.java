package com.chen.demo01;

import java.util.Random;

/**
 * @author chen
 * @date 2020/5/9 16:00
 */
public class MyRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int count=0;
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(6)+1;
            System.out.println("随机数"+num);
            if (num==5){
                count++;
            }
        }
        System.out.println("摇到5的次数"+count);
    }
}
