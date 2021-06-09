package com.xiaoyuan.designpattern.structural.bridge;

/**
 * @author : cold ice
 * @date : 2021-06-09 15:50
 */
public class ShoppingMall extends SellFruit{

    protected ShoppingMall(Fruit fruit) {
        super(fruit);
    }

    @Override
    public void sell() {
        String name = super.fruit.name();
        String discount = super.fruit.discount();

        System.out.println(name+discount);

    }
}
