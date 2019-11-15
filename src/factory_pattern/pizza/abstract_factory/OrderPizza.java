package factory_pattern.pizza.abstract_factory;

/**
 * Created by Pudding-hcy on 2019/11/15.
 */
public class OrderPizza {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");
    }
}
