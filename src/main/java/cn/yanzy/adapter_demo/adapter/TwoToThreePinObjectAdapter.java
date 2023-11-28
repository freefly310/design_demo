package cn.yanzy.adapter_demo.adapter;

import cn.yanzy.adapter_demo.component.TwoPinPlug;
import cn.yanzy.adapter_demo.component.ThreePinPlug;

// 对象模式的适配器类，用于将三孔插头适配为两孔插头
public class TwoToThreePinObjectAdapter implements TwoPinPlug {
    private ThreePinPlug threePinPlug;

    public TwoToThreePinObjectAdapter(ThreePinPlug threePinPlug) {
        this.threePinPlug = threePinPlug;
    }

    @Override
    public void plugInTwoPin() {
        System.out.println("通过适配器将两孔插头转换为三孔插头...");
        threePinPlug.plugInThreePin();
    }
}