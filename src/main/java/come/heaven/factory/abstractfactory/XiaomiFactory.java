package come.heaven.factory.abstractfactory;

/**
 * @author zhanggq
 * @date 2022/6/13 14:59
 */
public class XiaomiFactory implements Factory{
    @Override
    public Phone phoneFactory() {
        return new XiaomiPhone();
    }

    @Override
    public Router routerFactory() {
        return new XiaomiRouter();
    }
}
