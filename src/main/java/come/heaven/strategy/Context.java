package come.heaven.strategy;

/**
 * @author zhanggq
 * @date 2022/6/14 17:24
 */
public class Context {

    private Calculate calculate;

    public Context(Calculate calculate){
        this.calculate = calculate;
    }

    public int calculate(int a,int b){
        return calculate.calculate(a,b);
    }
}
