package deractor_pattern.starbuzz;

/**
 * Created by Pudding-hcy on 2019/11/8.
 */
public class Mocha extends CondimentDeractor {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
