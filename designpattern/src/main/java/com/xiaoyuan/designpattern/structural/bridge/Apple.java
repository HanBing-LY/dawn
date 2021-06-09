package com.xiaoyuan.designpattern.structural.bridge;

/**
 * @author : cold ice
 * @date : 2021-06-09 15:49
 */
public class Apple implements Fruit {

    @Override
    public String name() {
        return "苹果";
    }

    @Override
    public String discount() {
        return "买一筐送一框";
    }
}
