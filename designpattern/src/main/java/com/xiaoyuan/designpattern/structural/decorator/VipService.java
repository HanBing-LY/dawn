package com.xiaoyuan.designpattern.structural.decorator;

import java.math.BigDecimal;

/**
 * @author : cold ice  
 * @date : 2020/9/23 17:30  
 */
public class VipService extends Decorator {

    public VipService(Pay pay) {
        super(pay);
    }

    @Override
    public void success(BigDecimal money) {
        pay.success(money);
        System.out.println("添加会员积分:" + money.multiply(BigDecimal.valueOf(10)));
    }
}
