package cn.yanzy.decorator_demo.decorator;

import cn.yanzy.decorator_demo.component.Coffee;

// 添加牛奶的装饰者类
public class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getDescrption() {
        return super.getDescrption() + " with milk";
    }
}
