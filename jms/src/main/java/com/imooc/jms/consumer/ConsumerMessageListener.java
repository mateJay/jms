package com.imooc.jms.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @Author: mate_J
 * @Date: 2019/3/31 15:24
 * @Version 1.0
 */
public class ConsumerMessageListener implements MessageListener {
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
            System.out.println("接收消息:" + textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
