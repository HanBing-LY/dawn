package com.xiaoyuan.designpattern.structural.composite.safe;

import java.util.ArrayList;

/**
 * 树枝构件
 *
 * @author : cold ice
 * @date : 2021-06-09 17:01
 */
public class Composite implements Component {

    private ArrayList<Component> children = new ArrayList<>(16);


    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void operation() {
        for (Object obj : children) {
            ((Component) obj).operation();
        }
    }
}