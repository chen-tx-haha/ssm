package com.chen.demo01;

/**
 * @author chen
 * @date 2020/6/4 13:27
 */
public class DemoPriorityt {
    public static void main(String[] args) {
        PrioritytThread prioritytThread = new PrioritytThread();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(prioritytThread, "线程" + i);
            if (i==1){
                t.setPriority(10);
            }
            if (i==2){
                t.setPriority(1);

            }
            t.setDaemon(true);//设置为守护线程
            t.start();

        }
        try {
            Thread.sleep(1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程1总计：" + PrioritytThread.count1);
        System.out.println("线程2总计：" + PrioritytThread.count2);
    }
}
