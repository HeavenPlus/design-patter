package come.heaven.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import javax.jws.soap.SOAPBinding;
import java.lang.reflect.Method;

/**
 * @author zhanggq
 * @date 2022/6/14 13:18
 */
public class ProxyUser implements MethodInterceptor {

    private User target;

    public ProxyUser(User target){
        this.target = target;
    }

    public Object getInstence(){
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("目标方法执行前的操作========");
        Object invoke = method.invoke(target, objects);
        System.out.println("目标方法执行后的操作========");
        return invoke;
    }
}
