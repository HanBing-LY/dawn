package com.xiaoyuan.designpattern.behavioral.observer;

/**
 * @author : cold ice  
 * @date : 2020/9/23 18:18  
 */
public class UpdateCache implements GoodsCatListener {

    public UpdateCache() {
        ListenerManager.register(this);
    }

    @Override
    public void delete(Object object) {
        System.out.println(" 商品分类改变,刷新相关缓存: " + object);
    }
}
