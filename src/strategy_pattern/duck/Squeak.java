package strategy_pattern.duck;

/**
 * Created by Pudding-hcy on 2019/11/7.
 */
public class Squeak implements QuarkBehavior {

    @Override
    public void quark() {
        System.out.println("Squeak.");
    }
}
