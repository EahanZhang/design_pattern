package strategy_pattern.duck;

/**
 * Created by Pudding-hcy on 2019/11/7.
 */
public abstract class Duck {
    // has a
    FlyBehavior flyBehavior;
    QuarkBehavior quarkBehavior;

    public abstract void display();

    public void fly() {
        flyBehavior.fly();
    }

    public void quark() {
        quarkBehavior.quark();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
