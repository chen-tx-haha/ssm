package com.chen.model;

/**
 * @author chen
 * @date 2020/5/11 14:55
 */
public abstract class Person {
    public String name;
    public abstract void setAge();

    void getName() {
        System.out.println("抽象方法");
    }
    public static void setName(){

    }


}

