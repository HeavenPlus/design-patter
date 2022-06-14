package come.heaven.proxy.staticproxy;

/**
 * 静态代理
 * @author zhanggq
 * @date 2022/6/13 15:02
 */
public class Main {

    public static void main(String[] args) {
        User user = new User();
        ProxyUser proxyUser = new ProxyUser(user);
        proxyUser.login();
    }
}
