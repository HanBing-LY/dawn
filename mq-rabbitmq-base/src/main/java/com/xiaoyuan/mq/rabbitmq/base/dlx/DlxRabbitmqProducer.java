package com.xiaoyuan.mq.rabbitmq.base.dlx;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.xiaoyuan.mq.rabbitmq.base.util.RabbitMqConnectionUtil;

/**
 * Created by smlz on 2019/10/4.
 */
public class DlxRabbitmqProducer {

    public static void main(String[] args) throws Exception {

        //获取连接
        Connection connection = RabbitMqConnectionUtil.getConnection();

        //获取一个channel
        Channel channel = connection.createChannel();

        //消息十秒没有被消费，那么就会转到死信队列上
        AMQP.BasicProperties basicProperties = new AMQP.BasicProperties().builder()
                .deliveryMode(2)
                .expiration("10000")
                .build();

        //声明正常的队列
        String nomalExchangeName = "tuling.nomaldlx.exchange";
        String routingKey = "tuling.dlx.key1";

        String message = "我是测试的死信消息";
        for(int i=0;i<100;i++) {

            channel.basicPublish(nomalExchangeName,routingKey,basicProperties,message.getBytes());
        }
    }
}
