package com.imooc.jms.producer;

import com.oracle.jrockit.jfr.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @Author: mate_J
 * @Date: 2019/3/31 13:41
 * @Version 1.0
 */
public class AppProducer {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");
       ProducerService service = context.getBean(ProducerService.class);

        for(int i = 0; i < 100 ; i++){
            service.sendMessage("test" + i);
        }
    }
}
