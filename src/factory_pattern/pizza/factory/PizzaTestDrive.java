package factory_pattern.pizza.factory;

/**
 * Created by Pudding-hcy on 2019/11/11.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("Cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoPizzaStore.orderPizza("Cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
