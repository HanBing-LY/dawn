package com.xiaoyuan.mq.rabbitmq.base.dlx;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.xiaoyuan.mq.rabbitmq.base.util.RabbitMqConnectionUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by smlz on 2019/9/30.
 */
public class DlxRabbitmqConsumer {

    public static void main(String[] args) throws Exception {

        //获取连接
        Connection connection = RabbitMqConnectionUtil.getConnection();

        //获取一个channel
        Channel channel = connection.createChannel();

        //声明正常的队列
        String nomalExchangeName = "tuling.nomaldlx.exchange";
        String exchangeType = "topic";
        String nomalqueueName = "tuling.nomaldex.queue";
        String routingKey = "tuling.dlx.#";

        //申明死信队列
        String dlxExhcangeName = "tuling.dlx.exchange";
        String dlxQueueName = "tuling.dlx.queue";

        channel.exchangeDeclare(nomalExchangeName,exchangeType,true,false,null);


        Map<String,Object> queueArgs = new HashMap<>();
        //正常队列上绑定死信队列
        queueArgs.put("x-dead-letter-exchange",dlxExhcangeName);
        queueArgs.put("x-max-length",4);
        channel.queueDeclare(nomalqueueName,true,false,false,queueArgs);
        channel.queueBind(nomalqueueName,nomalExchangeName,routingKey);



        //声明死信队列
        channel.exchangeDeclare(dlxExhcangeName,exchangeType,true,false,null);
        channel.queueDeclare(dlxQueueName,true,false,false,null);
        channel.queueBind(dlxQueueName,dlxExhcangeName,"#");

        channel.basicConsume(nomalqueueName,false,new DlxConsumer(channel));

    }
}
