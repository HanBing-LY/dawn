package com.xiaoyuan.designpattern.create.abstractfactroy;

/**
 * @author : cold ice  
 *  抽象工厂
 * @date : 2020/9/23 16:41  
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {

        IDBComponent idbComponent = new OracleDbComponent();

        IConnection connection = idbComponent.getConnection();
        connection.connection();

        ICommand command = idbComponent.getCommand();
        command.command();

    }
}















