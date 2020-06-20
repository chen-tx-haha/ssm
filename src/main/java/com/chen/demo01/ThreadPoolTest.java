package com.chen.demo01;

import java.util.concurrent.*;

/**
 * @author chen
 * @date 2020/5/9 15:04
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        //创建线程池的步骤
        //1.创建线程池
        //ExecutorService service = Executors.newFixedThreadPool(2);//有两个线程对象
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
        //2.创建Runnable接口子类对象（task任务）
        MyRunnable r = new MyRunnable();
        //3.提交Runnable接口子类对象
        threadPool.execute(r);//线程池中获取线程对象1，调用MyRunnable的run()
        //threadPool.submit(r);//线程池中获取线程对象2，调用MyRunnable的run()
        //threadPool.submit(r);//线程池中获取线程对象3，调用MyRunnable的run()
        //线程执行完又回到线程池
        //关闭线程池
        //service.shutdown();
    }


}
