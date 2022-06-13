package come.heaven.factory.abstractfactory;

/**
 * @author zhanggq
 * @date 2022/6/13 14:56
 */
public class HuaweiPhone implements Phone{
    @Override
    public void produce() {
        System.out.println("生产华为手机");
    }
}
