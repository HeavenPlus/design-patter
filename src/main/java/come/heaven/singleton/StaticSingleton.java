package come.heaven.singleton;

/**
 * 单例模式--静态内部类模式
 *
 * @author zhanggq
 * @date 2022/6/10 11:50
 */
public class StaticSingleton {

    private StaticSingleton() {
    }

    private static class InnerSingleton {
        private static StaticSingleton instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {
        return InnerSingleton.instance;
    }
}
