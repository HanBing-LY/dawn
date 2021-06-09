package com.xiaoyuan.designpattern.structural.facade;

/**
 * @author : cold ice  
 *
 * @date : 2020/9/23 13:35  
 */
public class Client {

    Facade facade = new Facade();

    public void doSomething() {
        facade.doSomethingFacade();
    }
}
