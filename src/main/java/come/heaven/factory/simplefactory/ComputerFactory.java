package come.heaven.factory.simplefactory;

/** 简单工厂模式
 * @author zhanggq
 * @date 2022/6/13 13:23
 */
public class ComputerFactory {

    public static void produce(String type){
        switch (type){
            case "huawei":
                new HuaweiComputer().produce();
                break;
            case "xiaomi":
                new XiaomiComputer().produce();
                break;
            default:
                System.out.println("未知产品类型");
                break;
        }
    }

}
