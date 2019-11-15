package factory_pattern.pizza.abstract_factory;

/**
 * Created by Pudding-hcy on 2019/11/15.
 */
public interface PizzaIngredientFactory {

    public Dough createDough();         // 面团
    public Sauce createSauce();         // 沙司
    public Cheese createCheese();       // 奶酪
    public Veggies[] createVeggies();   // 蔬菜
    public Pepperoni createPepperoni(); // 香肠
    public Clams createClams();         // 蛤蜊
}
