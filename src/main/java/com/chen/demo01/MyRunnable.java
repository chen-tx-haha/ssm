package com.chen.demo01;

/**
 * @author chen
 * @date 2020/5/9 14:55
 */
public class MyRunnable implements Runnable {
    //重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread()+"+"+i);
        }
    }
}
