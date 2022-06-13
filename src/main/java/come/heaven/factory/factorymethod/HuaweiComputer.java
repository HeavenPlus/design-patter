package come.heaven.factory.factorymethod;

/**
 * @author zhanggq
 * @date 2022/6/13 14:33
 */
public class HuaweiComputer implements Computer{
    @Override
    public void produce() {
        System.out.println("生产华为电脑");
    }
}
