package come.heaven.factory.abstractfactory;

/**
 * @author zhanggq
 * @date 2022/6/13 14:56
 */
public class HuaweiRouter implements Router{
    @Override
    public void produce() {
        System.out.println("生产华为路由器");
    }
}
