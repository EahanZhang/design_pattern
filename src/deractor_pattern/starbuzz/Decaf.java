package deractor_pattern.starbuzz;

/**
 * Created by Pudding-hcy on 2019/11/8.
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
