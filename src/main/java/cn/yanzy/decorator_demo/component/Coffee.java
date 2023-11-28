package cn.yanzy.decorator_demo.component;

/**
 * component是组件包，组件是被装饰的对象。
 * 组件由一个接口和一个实现类组成，接口定义了组件的行为，实现类实现了组件的行为。
 * 可以有多个实现类，比如Espresso浓咖啡、Latte拿铁咖啡等。
 * 本例中: Coffee接口定义了咖啡的行为，SimpleCoffee实现了咖啡的行为。
 */

// Coffee接口
public interface Coffee {

    double getCost();
    String getDescrption();
}
