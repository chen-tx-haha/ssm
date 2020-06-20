package com.chen.demo01;

/**
 * @author chen
 * @date 2020/6/4 13:30
 */
public class PrioritytThread implements Runnable {
    public static Integer count1 = 0;
    public static Integer count2 = 0;

    @Override
    public void run() {
        while (true){
            if ("线程1".equals(Thread.currentThread().getName())){
                count1++;
            }
            if ("线程2".equals(Thread.currentThread().getName())){
                count2++;
            }
            if (Thread.currentThread().isInterrupted()){
                break;
            }
        }
    }
}
