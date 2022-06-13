package come.heaven.factory.abstractfactory;

/**
 * 抽象工厂模式
 * @author zhanggq
 * @date 2022/6/13 15:00
 */
public class Main {

    public static void main(String[] args) {
        Factory factory = new HuaweiFactory();
        factory.phoneFactory().produce();
        factory.routerFactory().produce();
    }
}
