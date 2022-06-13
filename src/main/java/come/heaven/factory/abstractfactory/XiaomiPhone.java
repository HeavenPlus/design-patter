package come.heaven.factory.abstractfactory;

/**
 * @author zhanggq
 * @date 2022/6/13 14:57
 */
public class XiaomiPhone implements Phone{
    @Override
    public void produce() {
        System.out.println("生产小米手机");
    }
}
