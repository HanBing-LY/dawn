package com.xiaoyuan.designpattern.structural.decorator;

import java.math.BigDecimal;

/**
 * @author : cold ice  
 * @date : 2020/9/23 17:30  
 */
public interface Pay {

    /**
     * 支付成功
     */
    void success(BigDecimal money);
}
