package factory_pattern.pizza.abstract_factory;

/**
 * Created by Pudding-hcy on 2019/11/15.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (name != null && !name.isEmpty()) {
            stringBuilder.append("name: " + name + "\n");
        }

        if (dough != null) {
            stringBuilder.append("dough: " + dough.getClass().getSimpleName() + "\n");
        }

        if (sauce != null) {
            stringBuilder.append("sauce: " + sauce.getClass().getSimpleName() + "\n");
        }

        if (veggies != null && veggies.length > 0) {
            StringBuilder veggiesList = new StringBuilder();
            for (Veggies s : veggies) {
                veggiesList.append(s.getClass().getSimpleName() + " ");
            }
            veggiesList.append("\n");
            stringBuilder.append("sauce: ");
            stringBuilder.append(veggiesList);
        }

        if (cheese != null) {
            stringBuilder.append("cheese: " + cheese.getClass().getSimpleName() + "\n");
        }

        if (pepperoni != null) {
            stringBuilder.append("pepperoni: " + pepperoni.getClass().getSimpleName() + "\n");
        }

        if (clams != null) {
            stringBuilder.append("clams: " + clams.getClass().getSimpleName() + "\n");
        }

        return stringBuilder.toString();
    }
}
