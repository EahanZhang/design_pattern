package command_pattern;

/**
 * Created by Pudding-hcy on 2019/11/18.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        // 构建遥控器
        SimpleRemoteControl remote = new SimpleRemoteControl();
        // 创建灯对象
        Light light = new Light();
        // 车库门对象
        GarageDoor garageDoor = new GarageDoor();
        // 灯命令对象
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        // 车门命令对象
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        // 设置遥控器上的命令
        remote.setCommand(lightOnCommand);
        // 按下遥控器按钮
        remote.buttonWasPressed();
        // 重设遥控器上的命令
        remote.setCommand(garageDoorOpenCommand);
        // 按下遥控器按钮
        remote.buttonWasPressed();
    }
}
