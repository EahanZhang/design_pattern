package singleton_pattern;

/**
 * Created by Pudding-hcy on 2019/11/18.
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }
}
