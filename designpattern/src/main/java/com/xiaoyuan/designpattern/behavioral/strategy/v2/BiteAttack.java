package com.xiaoyuan.designpattern.behavioral.strategy.v2;

/**
 * @author : cold ice  
 *
 * @date : 2020/9/23 17:55  
 */
public class BiteAttack implements Attackable {

    @Override
    public void attack() {
        System.out.println("咬.");
    }
}
