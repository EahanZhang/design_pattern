package strategy_pattern.duck;

/**
 * Created by Pudding-hcy on 2019/11/7.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quarkBehavior = new Quark();
    }

    @Override
    public void display() {
        System.out.println("I'm a real mallard duck.");
    }
}
