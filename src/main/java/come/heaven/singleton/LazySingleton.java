package come.heaven.singleton;

/**
 * 单例模式--懒汉式
 *
 * @author zhanggq
 * @date 2022/6/9 9:14
 */
public class LazySingleton {

    private static volatile LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (null == instance) {
            synchronized (LazySingleton.class) {
                if (null == instance) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
