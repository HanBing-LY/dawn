package com.xiaoyuan.mq.rabbitmq.template.server.direct;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liyuan
 * @description 直接模式
 * 可以具备多个接受规则(路由?)
 * 满足条件就会接受消息,不满足都不会接受,消息丢失,消息会消费多次
 */
@RestController
public class DirectProvider {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    //回调函数: confirm确认
    final RabbitTemplate.ConfirmCallback confirmCallback = (correlationData, ack, cause) -> {
        if(ack){
            //如果confirm返回成功 则进行更新
            System.out.println("推送成功.....");
        } else {
            //失败则进行具体的后续操作:重试 或者补偿等手段
            System.err.println("异常处理...");
        }
    };

    @GetMapping("/direct")
    public String send(int i) {
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());//24小时制
        String context = "hello " + date;
        // 消息内容
        String message = "我下架了商品!";

        String routingKey;
        // 两个都可以消费
        routingKey = "delete";
        // 1可以消费
//        routingKey = "add";
        // 2可以消费
//        routingKey = "update";
        // 两个都不可以消费
//        routingKey = "query";
        // 通过实现 ConfirmCallback 接口，消息发送到 Broker 后触发回调，确认消息是否到达 Broker 服务器，也就是只确认是否正确到达 Exchange 中
        rabbitTemplate.setConfirmCallback(confirmCallback);
        System.out.println("Sender : " + message);
        this.rabbitTemplate.convertAndSend(DirectParamConstant.EXCHANGE_NAME,routingKey,  message);


//        //简单对列的情况下routingKey即为Q名
//        new Random().ints().limit(i).forEach(a -> {
//
//        });
        return "success";
    }

}
