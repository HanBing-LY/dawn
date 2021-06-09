package com.xiaoyuan.designpattern.structural.decorator;

import java.math.BigDecimal;

/**
 * @author : cold ice  
 * @date : 2020/9/23 17:30  
 */
public class OrderCreate implements Pay {

    public OrderCreate() {

        System.out.println("下单了-----");

    }

    @Override
    public void success(BigDecimal money) {
        System.out.println("支付成功:" + money + "元");
    }
}
