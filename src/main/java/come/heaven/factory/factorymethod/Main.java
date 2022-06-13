package come.heaven.factory.factorymethod;

/**
 * 工厂方法模式
 * @author zhanggq
 * @date 2022/6/13 13:41
 */
public class Main {

    public static void main(String[] args) {
        Computer factory = new HuaweiComputerFactory().factory();
        factory.produce();
    }

}
