package com.xiaoyuan.designpattern.structural.bridge;

/**
 * @author : cold ice
 * @date : 2021-06-09 15:46
 */
public abstract class SellFruit {

    protected Fruit fruit;

    protected SellFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public abstract void sell();

}
