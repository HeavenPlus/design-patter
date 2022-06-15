package come.heaven.strategy;

/**
 * @author zhanggq
 * @date 2022/6/14 17:23
 */
public class DivideCalculate implements Calculate{
    @Override
    public int calculate(int a, int b) {
        return a/b;
    }
}
