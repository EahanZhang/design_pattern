package deractor_pattern.starbuzz;

/**
 * Created by Pudding-hcy on 2019/11/8.
 */
public class Milk extends CondimentDeractor {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
