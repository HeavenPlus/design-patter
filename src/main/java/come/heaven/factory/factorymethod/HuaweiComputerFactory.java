package come.heaven.factory.factorymethod;

/**
 * @author zhanggq
 * @date 2022/6/13 14:33
 */
public class HuaweiComputerFactory implements ComputerFactory{
    @Override
    public Computer factory() {
        return new HuaweiComputer();
    }
}
