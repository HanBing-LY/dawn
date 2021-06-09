package com.xiaoyuan.designpattern.create.factorymethod;

/**
 * @author : cold ice  
 *
 * @date : 2020/9/23 16:36  
 */
public class LamborghiniFactory extends CarFactory {

    @Override
    public Car assembleCar() {
        return new Lamborghini();
    }
}
