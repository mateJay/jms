package com.imooc.jms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.annotation.Resource;
import javax.jms.*;

/**
 * @Author: mate_J
 * @Date: 2019/3/31 13:27
 * @Version 1.0
 */
public class ProducerServiceImpl implements ProducerService{
    @Autowired
    JmsTemplate jmsTemplate;

    /**
     * @Autowired与@Resource都可以用来装配bean. 都可以写在字段上,或写在setter方法上。
     * @Autowired默认按类型装配（这个注解是属于spring的）
     * @Resource（这个注解属于J2EE的），默认安照名称进行装配，名称可以通过name属性进行指定
     */
//    @Resource(name = "queueDestination")
    @Resource(name = "topicDestination")
    Destination destination;
    public void sendMessage(final String msg) {
        jmsTemplate.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage(msg);
                return textMessage;
            }
        });

        System.out.println("发送消息：" + msg);
    }
}
