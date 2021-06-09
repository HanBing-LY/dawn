package com.xiaoyuan.designpattern.behavioral.templatemethod;

/**
 * @author : cold ice  
 * @date : 2020/9/23 18:12  
 */
public class GroupService extends AbstractClass {

    public void createActivity() {
        int id = basicCreate();
        // do others
    }

    @Override
    protected void checkActivityCommon() {
        System.out.println("校验拼团活动---");
    }
}
