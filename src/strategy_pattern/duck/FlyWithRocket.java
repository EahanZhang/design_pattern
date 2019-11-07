package strategy_pattern.duck;

/**
 * Created by Pudding-hcy on 2019/11/7.
 */
public class FlyWithRocket implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with rocket.");
    }
}
