package com.itwf.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author LiuFeng
 * @Date 2020/10/23 16:41
 */
public class CheckItem {
    public static void main(String[] args)throws Exception {
        ClassPathXmlApplicationContext applicationContext =
                 new ClassPathXmlApplicationContext("classpath:applicationContext-service.xml");
        System.in.read();
    }
}
