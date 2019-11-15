package factory_pattern.pizza.abstract_factory;

/**
 * Created by Pudding-hcy on 2019/11/15.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory =
                new NYPizzaIngredientFactory();

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case "veggie":
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("New York Style Veggie Pizza");
                break;
            case "clam":
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;
            case "pepperoni":
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                break;
        }
        return pizza;
    }
}
