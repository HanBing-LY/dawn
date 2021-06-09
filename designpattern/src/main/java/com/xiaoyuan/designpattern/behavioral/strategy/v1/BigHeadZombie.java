package com.xiaoyuan.designpattern.behavioral.strategy.v1;

/**
 * @author : cold ice  
 *
 * @date : 2020/9/23 17:45  
 */
public class BigHeadZombie extends AbstractZombie {

    @Override
    public void display() {
        System.out.println("我是大头僵尸.");
    }

    @Override
    public void attack() {
        // ...
        // ...
        System.out.println("头撞");
    }
}
