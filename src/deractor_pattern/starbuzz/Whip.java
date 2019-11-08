package deractor_pattern.starbuzz;

/**
 * Created by Pudding-hcy on 2019/11/8.
 */
public class Whip extends CondimentDeractor {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
