package com.xiaoyuan.designpattern.create.abstractfactroy;

/**
 * @author : cold ice  
 *
 * @date : 2020/9/23 16:40  
 */
public interface IDBComponent {

    IConnection getConnection();

    ICommand getCommand();
}
