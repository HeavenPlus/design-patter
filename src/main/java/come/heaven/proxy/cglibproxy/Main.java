package come.heaven.proxy.cglibproxy;

/**
 * Cglib代理
 * @author zhanggq
 * @date 2022/6/14 13:18
 */
public class Main {

    public static void main(String[] args) {
        User user = new User();
        User instence = (User) new ProxyUser(user).getInstence();
        instence.login();
    }
}
