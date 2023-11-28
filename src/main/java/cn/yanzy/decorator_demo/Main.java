package cn.yanzy.decorator_demo;

import cn.yanzy.decorator_demo.component.Coffee;
import cn.yanzy.decorator_demo.decorator.Milk;
import cn.yanzy.decorator_demo.component.impl.SimpleCoffee;
import cn.yanzy.decorator_demo.decorator.Vanilla;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // 1. 创建一个简单咖啡
        Coffee coffee = new SimpleCoffee();

        // 2. 给咖啡加点牛奶
        coffee = new Milk(coffee);

        // 3. 给咖啡加点香草味
        coffee = new Vanilla(coffee);

        // 3. 打印出咖啡的价格和描述
        System.out.println("花费了: " + coffee.getCost());
        System.out.println("咖啡的描述: " + coffee.getDescrption());

    }
}