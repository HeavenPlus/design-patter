package come.heaven.proxy.jdkproxy;

/**
 * JDK动态代理
 * @author zhanggq
 * @date 2022/6/14 10:32
 */
public class Main {

    public static void main(String[] args) {
        IUserService user = new User();
        IUserService userService = (IUserService) new ProxyUser(user).getInstence();
        userService.login();
    }
}
