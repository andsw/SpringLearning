package cnjxufe.beans_14_AOP_implWithXML;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author hsw
 * @create 2018-11-09  22:12
 */
public class AspectJLogging {

    public void beforeMethod(JoinPoint joinPoint) {
        System.out.println("the method named " + joinPoint.getSignature().getName()
                + " begins with the parameters : " + Arrays.asList((joinPoint.getArgs())));
    }

    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("the method named " + joinPoint.getSignature().getName()
                + " ends with the parameters : " + Arrays.asList((joinPoint.getArgs())));
    }

    public void afterReturning(JoinPoint joinPoint, Object result) {
        System.out.println(joinPoint.getSignature().getName()
                + " method is ends with result : " + result);
    }

    public void afterThrowing(JoinPoint joinPoint, Exception e) {
        System.out.println(joinPoint.getSignature().getName() + " method is ends with exception : " + e);
    }

    /**
     * 环绕通知相当于代理方法的全过程，必须要带一个ProceedingJointpoint参数
     * @param proceedingJoinPoint
     * */
    public int aroundMethod(ProceedingJoinPoint proceedingJoinPoint) {
        int res = 0;
        try {
            //上述前置方法位置相当于是这儿
            res = (int) proceedingJoinPoint.proceed();
            //上述返回通知方法相当于放这儿
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            //上述抛出异常方法相当于放这儿
        }
        //后置通知方法相当于放这儿
        return res;
    }
}
