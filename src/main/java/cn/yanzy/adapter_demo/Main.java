package cn.yanzy.adapter_demo;

import cn.yanzy.adapter_demo.adapter.TwoToThreePinClassAdapter;
import cn.yanzy.adapter_demo.component.TwoPinPlug;

// 客户端代码
public class Main {
    public static void main(String[] args) {

/*

        //  - 使用对象适配器
        // 创建一个具体的三孔插头对象
        ThreePinPlug threePinPlug = new ConcreteThreePinPlug();

        // 创建适配器并将三孔插头适配为两孔插头
        TwoPinPlug twoPinPlug = new TwoToThreePinAdapter(threePinPlug);

        // 使用两孔插头插入
        twoPinPlug.plugInTwoPin();
*/

        //  - 使用类适配器
        // 创建适配器对象
        TwoPinPlug twoPinPlug = new TwoToThreePinClassAdapter();

        // 使用适配器连接
        twoPinPlug.plugInTwoPin();
    }
}
