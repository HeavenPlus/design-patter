package come.heaven.strategy;

/**
 * 策略模式
 * @author zhanggq
 * @date 2022/6/14 17:19
 */
public class Main {

    public static void main(String[] args) {
        Calculate calculate = new AddCalculate();
        Context context = new Context(calculate);
        int res = context.calculate(1, 2);
        System.out.println(res);
    }
}
