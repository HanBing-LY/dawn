package com.xiaoyuan.designpattern.structural.decorator;

/**
 * @author : cold ice  
 *
 * @date : 2020/9/23 17:30  
 */
public abstract class Decorator implements Pay {
    Pay pay;

    public Decorator(Pay pay) {
        this.pay = pay;
    }
}
