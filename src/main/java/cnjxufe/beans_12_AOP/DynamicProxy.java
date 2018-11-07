package cnjxufe.beans_12_AOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author hsw
 * @create 2018-11-07  16:06
 */
public class DynamicProxy {

//    要代理的对象
    private CalculatorInterface target;

    public DynamicProxy(CalculatorInterface target) {
        this.target = target;
    }

    public CalculatorInterface getDynamicProxy() {
        CalculatorInterface proxy = null;
        ClassLoader loader = target.getClass().getClassLoader();
        proxy = (CalculatorInterface) Proxy.newProxyInstance(loader, new Class[]{CalculatorInterface.class}, (object, method, args) -> {
            System.out.println(method.getName() + "方法被调用，参数 : a = " + args[0] + ", b = " + args[1]);
            int result = (int) method.invoke(target, args[0], args[1]);
            System.out.println("a " + method.getName() + " b = " + result);
            return result;
        });
        return proxy;
    }
}
