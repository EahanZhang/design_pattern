package command_pattern;

/**
 * Created by Pudding-hcy on 2019/11/18.
 */
public class Light {
    private boolean isLight;

    public void on() {
        if (!isLight) {
            isLight = true;
            System.out.println("Light turns on.");
        } else {
            System.out.println("Light already on.");
        }
    }

    public void off() {
        if (isLight) {
            isLight = false;
            System.out.println("Light turns off.");
        } else {
            System.out.println("Light already off.");
        }
    }
}
