package deractor_pattern.starbuzz;

/**
 * Created by Pudding-hcy on 2019/11/8.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
