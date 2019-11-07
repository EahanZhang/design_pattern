package strategy_pattern.duck;

/**
 * Created by Pudding-hcy on 2019/11/7.
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        // 测试策略模式实现代码可以成功运行
        Duck mallard = new MallardDuck();
        mallard.quark();
        mallard.fly();

        // 测试策略模式在增加和修改功能或者类时十分方便
        Duck rocket = new RocketDuck();
        rocket.quark();
        rocket.fly();
    }
}
