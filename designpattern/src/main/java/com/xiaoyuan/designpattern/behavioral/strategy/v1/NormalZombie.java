package com.xiaoyuan.designpattern.behavioral.strategy.v1;

/**
 * @author : cold ice  
 *
 * @date : 2020/9/23 17:46  
 */
public class NormalZombie extends AbstractZombie {

    @Override
    public void display() {
        System.out.println("我是普通僵尸。");
    }

}
