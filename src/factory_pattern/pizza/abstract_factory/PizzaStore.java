package factory_pattern.pizza.abstract_factory;

import factory_pattern.pizza.abstract_factory.Pizza;

/**
 * Created by Pudding-hcy on 2019/11/11.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println(pizza.toString());
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
