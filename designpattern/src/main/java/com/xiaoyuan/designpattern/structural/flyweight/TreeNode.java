package com.xiaoyuan.designpattern.structural.flyweight;

/**
 * @author : cold ice  
 * @date : 2020/9/23 11:11  
 */
public class TreeNode {

    private String name;
    private TreeType treeType;

    public TreeNode(String name, TreeType treeType) {
        this.name = name;
        this.treeType = treeType;
    }
}
