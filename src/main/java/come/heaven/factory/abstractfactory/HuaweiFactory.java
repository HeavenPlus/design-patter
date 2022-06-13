package come.heaven.factory.abstractfactory;

/**
 * @author zhanggq
 * @date 2022/6/13 14:58
 */
public class HuaweiFactory implements Factory{
    @Override
    public Phone phoneFactory() {
        return new HuaweiPhone();
    }

    @Override
    public Router routerFactory() {
        return new HuaweiRouter();
    }
}
