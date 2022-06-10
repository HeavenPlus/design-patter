package come.heaven.singleton;

/**
 * 单例模式--饿汉式
 *
 * @author zhanggq
 * @date 2022/6/10 11:48
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
