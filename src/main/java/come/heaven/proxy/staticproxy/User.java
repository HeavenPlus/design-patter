package come.heaven.proxy.staticproxy;

/**
 * @author zhanggq
 * @date 2022/6/14 10:28
 */
public class User implements IUserService {
    @Override
    public void login() {
        System.out.println("用户登录");
    }
}
