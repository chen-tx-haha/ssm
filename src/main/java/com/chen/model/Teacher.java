package com.chen.model;

/**
 * @author chen
 * @date 2020/5/11 14:55
 */
public class Teacher extends Person{


    @Override
    public void setAge() {

        System.out.println("实现抽象方法");
    }

    public Teacher() {
    }

}
