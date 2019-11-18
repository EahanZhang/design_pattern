package singleton_pattern;

/**
 * Created by Pudding-hcy on 2019/11/18.
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return instance;
    }
}
