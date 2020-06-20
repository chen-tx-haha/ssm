package com.chen.demo01;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author chen
 * @date 2020/3/19 17:43
 */
public class Singleton {
    private static Singleton singleton;

    public Singleton() {
    }
    public static Singleton getSingleton(){
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5, 10, 10, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
        if (singleton==null){

            singleton = new Singleton();
        }
        return singleton;
    }


}

