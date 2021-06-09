package com.xiaoyuan.designpattern.structural.flyweight;

/**
 * @author : cold ice  
 * 享元模式  运用共享技术有效地支持大量细粒度的对象;如果系统有大量类似的对象，可以节省大量的内存及CPU资源
 * @date : 2020/9/23 11:12  
 */
public class FlyWeightTest {
    public static void main(String[] args) {
        TreeFactory.getTreeTypeByName("1", new TreeType("树"));

        System.out.println(TreeFactory.map.size());

        TreeFactory.getTreeTypeByName("2", new TreeType("队列"));
        System.out.println(TreeFactory.map.size());

        TreeFactory.getTreeTypeByName("3", new TreeType("图"));

        System.out.println(TreeFactory.map.size());

        TreeFactory.getTreeTypeByName("4", new TreeType("链表"));

        System.out.println(TreeFactory.map.size());

        TreeFactory.getTreeTypeByName("3", new TreeType("图"));

        System.out.println(TreeFactory.map.size());
    }
}