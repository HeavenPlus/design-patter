package come.heaven.proxy.staticproxy;

/**
 * @author zhanggq
 * @date 2022/6/14 10:28
 */
public class ProxyUser implements Login{

    private User target;

    public ProxyUser(User target){
        this.target = target;
    }

    @Override
    public void login() {
        System.out.println("=======登录前打印日志======");
        target.login();
        System.out.println("=======登录后打印日志======");
    }
}
