package com.chen.model;

import com.chen.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chen
 * @date 2020/3/15 11:54
 */
public class Account {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
    }
}
