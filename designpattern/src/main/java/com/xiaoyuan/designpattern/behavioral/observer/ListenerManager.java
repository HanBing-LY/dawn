package com.xiaoyuan.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : cold ice  
 * @date : 2020/9/23 18:19  
 */
public class ListenerManager {

    /**
     * 监听者
     */
    private static List<GoodsCatListener> container = new ArrayList<>(16);

    public static void register(GoodsCatListener goodsCatListener) {
        container.add(goodsCatListener);
    }

    public static void remove(GoodsCatListener goodsCatListener) {
        container.remove(goodsCatListener);
    }

    public static void invokeListener(Object object) {
        for (GoodsCatListener item : container) {
            item.delete(object);
        }
    }
}
