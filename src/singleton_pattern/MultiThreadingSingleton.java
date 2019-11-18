package singleton_pattern;

/**
 * Created by Pudding-hcy on 2019/11/18.
 */
public class MultiThreadingSingleton {
    private static MultiThreadingSingleton instance;

    private MultiThreadingSingleton() {}

    public static MultiThreadingSingleton getInstance() {
        if (instance == null) {
            synchronized (MultiThreadingSingleton.class) {
                instance = new MultiThreadingSingleton();
            }
        }

        return instance;
    }
}
