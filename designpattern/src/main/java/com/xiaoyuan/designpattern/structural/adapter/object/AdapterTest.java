package com.xiaoyuan.designpattern.structural.adapter.object;

/**
 * 适配器模式-对象
 *
 * @author : cold ice  
 * @date : 2020/9/23 17:21  
 */
public class AdapterTest {
    public static void main(String[] args) {
        OrdinaryCircuit ordinaryCircuit = new OrdinaryCircuit();

        Electricity electricity = new TransformerBox(ordinaryCircuit);
        electricity.outputVoltage();

    }
}


