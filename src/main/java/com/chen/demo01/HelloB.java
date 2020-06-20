package com.chen.demo01;

/**
 * @author chen
 * @date 2020/4/29 16:10
 */
public class HelloB extends HelloA {
    public HelloB(){
        System.out.println("HelloB");
    }
    {
        System.out.println("I'm  B class");
    }
    static {
        System.out.println("start B");
    }

    public static void main(String[] args) {
        new HelloB();
    }
}
