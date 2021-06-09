package com.xiaoyuan.designpattern.structural.composite.transparent;

/**
 * 树叶构件
 *
 * @author : cold ice
 * @date : 2021-06-09 17:01
 */
public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {
    }

    @Override
    public void operation() {
        System.out.println("树叶" + name + "：被访问！");
    }
}