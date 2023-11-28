package cn.yanzy.decorator_demo.decorator;

import cn.yanzy.decorator_demo.component.Coffee;

// 咖啡装饰者类，实现了 Coffee 接口
public abstract class CoffeeDecorator implements Coffee {

    protected final Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }

    @Override
    public String getDescrption() {
        return decoratedCoffee.getDescrption();
    }
}
