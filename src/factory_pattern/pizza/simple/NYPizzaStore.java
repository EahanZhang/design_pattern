package factory_pattern.pizza.simple;

/**
 * Created by Pudding-hcy on 2019/11/11.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("Cheese")) {
            return new NYStyleCheesePizza();
        }
        return null;
    }
}
