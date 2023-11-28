package cn.yanzy.adapter_demo.component.impl;

import cn.yanzy.adapter_demo.component.ThreePinPlug;

// 实现一个具体的三孔插头
public class ConcreteThreePinPlug implements ThreePinPlug {
    @Override
    public void plugInThreePin() {
        System.out.println("使用三孔插头进行连接...");
    }
}