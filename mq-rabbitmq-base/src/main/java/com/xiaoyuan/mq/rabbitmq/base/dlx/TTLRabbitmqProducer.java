package com.xiaoyuan.mq.rabbitmq.base.dlx;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.xiaoyuan.mq.rabbitmq.base.util.RabbitMqConnectionUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by smlz on 2019/9/30.
 */
public class TTLRabbitmqProducer {

    public static void main(String[] args) throws Exception {

        //创建一个连接
        Connection connection = RabbitMqConnectionUtil.getConnection();

        //创建一个channel
        Channel channel = connection.createChannel();

        //定义交换机的名称
        String exchangeName = "tuling.ttl.direct";

        String routingKey = "tuling.ttl.key";

        String queueName = "tuling.ttl.queue";

        //申明交换机
        channel.exchangeDeclare(exchangeName,"direct",true,false,null);

        //申明队列
        Map<String,Object> queueArgs = new HashMap<>();
        //设置队列中的消息10s没有被消费就会过期
        queueArgs.put("x-message-ttl",10000);
        //队列的长度
        queueArgs.put("x-max-length",4);
        channel.queueDeclare(queueName,true,false,false,queueArgs);

        //绑定
        channel.queueBind(queueName,exchangeName,routingKey);

        String msgBody = "你好tuling";
        for(int i=0;i<10;i++) {
            channel.basicPublish(exchangeName,routingKey,null,(msgBody+i).getBytes());
        }
    }
}
