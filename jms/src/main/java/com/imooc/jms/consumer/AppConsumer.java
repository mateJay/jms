package com.imooc.jms.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: mate_J
 * @Date: 2019/3/31 15:30
 * @Version 1.0
 */
public class AppConsumer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
    }
}
