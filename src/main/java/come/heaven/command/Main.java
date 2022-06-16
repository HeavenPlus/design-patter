package come.heaven.command;

/**
 * 命令模式
 * @author zhanggq
 * @date 2022/6/16 13:15
 */
public class Main {

    public static void main(String[] args) {
        Command command = new OpenCommand();
        Invoker invoker = new Invoker(command);
        invoker.execute();
    }
}
