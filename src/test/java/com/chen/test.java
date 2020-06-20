package com.chen;

import com.chen.mapper.Mapper;
import com.chen.mapper.impl.MapperImpl;
import org.junit.Test;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chen
 * @date 2020/3/20 18:04
 */
public class test {
    @Test
    public void testJdkProxy() throws Exception{
        Mapper mapper = new MapperImpl();
        Mapper mi = (Mapper) Proxy.newProxyInstance(
                mapper.getClass().getClassLoader(),
                mapper.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("save".equals(method.getName())) {
                            System.out.println("权限校验");
                            return method.invoke(mapper, args);
                        }
                        return method.invoke(mapper, args);
                    }
                }
        );
        mi.save();
        TransactionTemplate transactionTemplate = new TransactionTemplate();
        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus transactionStatus) {
                return null;
            }
        });

    }

    @Test
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //创建了list的代理对象，通过代理对象添加功能
        List<String> proxyInstance = (List<String>) Proxy.newProxyInstance(list.getClass().getClassLoader(), list.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("验证");
                        return method.invoke(list,args);
                    }
                });
        proxyInstance.add("haha");
        System.out.println(list);
    }
}
