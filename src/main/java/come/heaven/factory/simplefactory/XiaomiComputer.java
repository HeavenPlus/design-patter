package come.heaven.factory.simplefactory;

/**
 * @author zhanggq
 * @date 2022/6/13 13:22
 */
public class XiaomiComputer implements Computer{
    @Override
    public void produce() {
        System.out.println("生产小米电脑");
    }
}
