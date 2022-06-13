package come.heaven.factory.simpleFactory;

/**
 * @author zhanggq
 * @date 2022/6/13 13:21
 */
public class HuaweiComputer implements Computer{
    @Override
    public void produce() {
        System.out.println("生产华为电脑");
    }
}
