package com.xiaoyuan.designpattern.behavioral.observer;

/**
 * @author : cold ice  
 * @date : 2020/9/23 18:19  
 */
public class UpdateEs implements GoodsCatListener {

    public UpdateEs() {
        ListenerManager.register(this);
    }

    @Override
    public void delete(Object object) {
        System.out.println(" 商品分类改变,推送搜索引擎刷新: " + object);
    }
}
