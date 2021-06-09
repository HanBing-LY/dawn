package com.xiaoyuan.designpattern.structural.decorator;

import java.math.BigDecimal;

/**
 * @author : cold ice  
 * @date : 2020/9/23 17:31  
 */
public class AccountService extends Decorator {


    public AccountService(Pay pay) {
        super(pay);
    }

    @Override
    public void success(BigDecimal money) {
        pay.success(money);
        System.out.println("发个短信,账户扣减:" + money);
    }
}
