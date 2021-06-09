package com.xiaoyuan.designpattern.structural.adapter.withclass;

import com.xiaoyuan.designpattern.structural.adapter.object.Electricity;
import com.xiaoyuan.designpattern.structural.adapter.object.OrdinaryCircuit;

/**
 * @author : cold ice  
 * @date : 2020/9/23 17:21  
 */
public class TransformerBox extends OrdinaryCircuit implements Electricity {

    @Override
    public int outputVoltage() {
        int i = super.out();

        int out = i * 2;

        System.out.println(String.format("原始电压： %d v  - >  输出电压： %d  v  ", i, out));

        return out;
    }
}
