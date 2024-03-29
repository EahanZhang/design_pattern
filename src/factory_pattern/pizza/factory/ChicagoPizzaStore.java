package factory_pattern.pizza.factory;

/**
 * Created by Pudding-hcy on 2019/11/11.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("Cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
