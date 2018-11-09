package cnjxufe.beans_13_AOP_impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author hsw
 * @create 2018-11-09  22:12
 */
@Aspect
@Component
public class AspectJLogging {

    @Before(value = "execution(public int cnjxufe.beans_13_AOP_impl.OriginalCalculator.add(int,int))")
    public void printLog() {
        System.out.println("The method begins");
    }

//    可以叠加
    @Before(value = "execution(public int cnjxufe.beans_13_AOP_impl.OriginalCalculator.*(int, int))")
    public void pringAfterLog(JoinPoint joinPoint) {
        System.out.println("the method named " + joinPoint.getSignature().getName()
                + " begins with the parameters : " + Arrays.asList((joinPoint.getArgs())));
    }

//    在目标方法执行之后执行（无论是否抛出错误）
//    注意，在后置方法红还是不能访问目标方法的返回值！
    @After(value = "execution(public int cnjxufe.beans_13_AOP_impl.OriginalCalculator.*(int, int))")
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("the method named " + joinPoint.getSignature().getName()
                + " ends with the parameters : " + Arrays.asList((joinPoint.getArgs())));
    }
}
