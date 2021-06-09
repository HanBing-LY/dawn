package com.xiaoyuan.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : cold ice  
 * @date : 2020/9/23 11:12  
 */
public class TreeFactory {

    static Map<String, TreeNode> map = new HashMap<>();

    public static TreeNode getTreeTypeByName(String name, TreeType type) {

        if (map.containsKey(name)) {
            return map.get(name);
        }

        TreeNode treeType = new TreeNode(name, type);
        map.put(name, treeType);
        return treeType;
    }

}
