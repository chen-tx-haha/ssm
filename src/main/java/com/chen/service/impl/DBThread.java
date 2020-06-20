package com.chen.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author chen
 * @date 2020/5/19 0:06
 */
@Component
public class DBThread implements Runnable {
    private String msg;
    private Logger log = LoggerFactory.getLogger(DBThread.class);

    /*@Autowired
    SystemLogService systemLogService;*/

    @Override
    public void run() {
        //模拟在数据库插入数据
        /*Systemlog systemlog = new Systemlog();
        systemlog.setTime(new Date());
        systemlog.setLogdescribe(msg);*/
        //systemLogService.insert(systemlog);
        log.info("insert->" + msg);

    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
