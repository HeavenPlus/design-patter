package come.heaven.factory.factorymethod;

/**
 * @author zhanggq
 * @date 2022/6/13 14:32
 */
public class XiaomuComputer implements Computer{
    @Override
    public void produce() {
        System.out.println("生产小米电脑");
    }
}
