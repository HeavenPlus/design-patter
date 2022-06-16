package come.heaven.command;

/**
 * @author zhanggq
 * @date 2022/6/16 13:16
 */
public class OpenCommand implements Command{

    private final TV tv = new TV();

    @Override
    public void execute() {
        tv.open();
    }
}
