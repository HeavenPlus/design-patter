package come.heaven.proxy.staticproxy;

/**
 * ้ๆไปฃ็
 * @author zhanggq
 * @date 2022/6/13 15:02
 */
public class Main {

    public static void main(String[] args) {
        IUserService user = new User();
        ProxyUser proxyUser = new ProxyUser(user);
        proxyUser.login();
    }
}
