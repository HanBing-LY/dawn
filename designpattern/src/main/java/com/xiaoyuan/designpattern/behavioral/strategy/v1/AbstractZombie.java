package com.xiaoyuan.designpattern.behavioral.strategy.v1;

/**
 * @author : cold ice  
 *
 * @date : 2020/9/23 17:44  
 */
public abstract class AbstractZombie {

    public abstract void display();

    public void attack() {
        System.out.println("咬.");
    }

    public void move() {
        System.out.println("一步一步移动.");
    }
}
