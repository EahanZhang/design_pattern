package command_pattern;

/**
 * Created by Pudding-hcy on 2019/11/18.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
