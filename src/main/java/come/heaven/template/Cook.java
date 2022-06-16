package come.heaven.template;

/**
 * @author zhanggq
 * @date 2022/6/16 17:37
 */
public abstract class Cook {

    public void cook(){
        prepare();
        start();
        end();
    }

    public abstract void prepare();

    public void start(){
        System.out.println("下锅");
    }

    public void end(){
        System.out.println("出锅");
    }
}
