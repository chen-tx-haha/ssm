package com.chen.controller;

import com.chen.service.impl.ThreadPoolManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chen
 * @date 2020/5/19 0:00
 */
@Controller
public class ThreadPoolController {
    @Autowired
    ThreadPoolManager tpm;
    @RequestMapping("/pool")

    public
    @ResponseBody
    Object test() {
        for (int i = 0; i < 500; i++) {
            //模拟并发500条记录
            tpm.processOrders(Integer.toString(i));
        }

        return "ok";
    }
}
