package com.xiaoyuan.designpattern.structural.adapter.object;

/**
 * @author : cold ice  
 * @date : 2020/9/23 17:21  
 */
public class TransformerBox implements Electricity {

    private final OrdinaryCircuit ordinaryCircuit;

    public TransformerBox(OrdinaryCircuit ordinaryCircuit) {
        this.ordinaryCircuit = ordinaryCircuit;
    }

    @Override
    public int outputVoltage() {
        int i = ordinaryCircuit.out();

        int out = i / 2;

        System.out.println(String.format("原始电压： %d v  - >  输出电压： %d  v  ", i, out));

        return out;
    }
}
