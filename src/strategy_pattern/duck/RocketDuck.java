package strategy_pattern.duck;

/**
 * Created by Pudding-hcy on 2019/11/7.
 */
public class RocketDuck extends Duck {

    public RocketDuck() {
        flyBehavior = new FlyWithRocket();
        quarkBehavior = new MuteQuark();
    }

    @Override
    public void display() {
        System.out.println("I'm a duck with rocket.");
    }
}
