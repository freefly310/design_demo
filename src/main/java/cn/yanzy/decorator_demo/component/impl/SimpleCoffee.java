package cn.yanzy.decorator_demo.component.impl;

import cn.yanzy.decorator_demo.component.Coffee;

// 简单咖啡 实现Coffee接口
public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 1.0;   // 返回简单咖啡的价格
    }

    @Override
    public String getDescrption() {
        return "SimpleCoffee"; // 返回简单咖啡的描述
    }
}
