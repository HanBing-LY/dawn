package com.xiaoyuan.designpattern.behavioral.templatemethod;

/**
 * @author : cold ice  
 * @date : 2020/9/23 18:12  
 */
public abstract class AbstractClass {

    public int basicCreate() {

        System.out.println(" 营销活动创建 ... ");

        checkActivity();

        doCreate();

        return 0;
    }

    private void doCreate() {
        System.out.println("保存活动基本信息");
    }

    /**
     * 活动是否允许重叠,是否多个商品一起组合
     */
    protected final void checkActivity() {
        // do ...
        System.out.println("检验活动基本信息");
        checkActivityCommon();
    }

    /**
     * 活动自定义规则
     */
    abstract protected void checkActivityCommon();
}
