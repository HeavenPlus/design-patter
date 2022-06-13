package come.heaven.factory.factorymethod;

/**
 * @author zhanggq
 * @date 2022/6/13 14:25
 */
public class XiaomiComputerFactory implements ComputerFactory{
    @Override
    public Computer factory() {
        return new XiaomuComputer();
    }
}
