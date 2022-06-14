package come.heaven.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhanggq
 * @date 2022/6/14 10:39
 */
public class ProxyUser {

    private IUserService target;

    public ProxyUser(IUserService target){
        this.target = target;
    }

    /**
     * @return 代理对象
     */
    public Object getInstence(){
        //第一个参数：类加载器
        //第二个参数：目标对象实现的接口
        //第三个参数：InvocationHandler
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("调用目标方法前的处理==========");
                //调用目标方法
                Object invoke = method.invoke(target, args);
                System.out.println("调用目标方法后的处理==========");
                return invoke;
            }
        });
    }
}
