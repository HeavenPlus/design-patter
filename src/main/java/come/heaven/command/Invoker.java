package come.heaven.command;

/**
 * @author zhanggq
 * @date 2022/6/16 13:25
 */
public class Invoker {

    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void execute(){
        command.execute();
    }

}
