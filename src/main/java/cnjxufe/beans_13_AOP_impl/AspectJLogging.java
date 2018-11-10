package cnjxufe.beans_13_AOP_impl;

import jdk.nashorn.internal.scripts.JO;
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

//    记住越小优先级越大
    @Order(value = 1)
//    在目标方法执行之后执行（无论是否抛出错误）
//    注意，在后置方法中还是不能访问目标方法的返回值！
    @After(value = "execution(public int cnjxufe.beans_13_AOP_impl.OriginalCalculator.*(int, int))")
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("the method named " + joinPoint.getSignature().getName()
                + " ends with the parameters : " + Arrays.asList((joinPoint.getArgs())));
    }

//重用切点表达式
//    下面两个方法的目标方法都是div，我们就可以重用切点，需要使用到相同切点的代理方法的就直接写这个方法名就行了
    @Pointcut(value = "execution(public int cnjxufe.beans_13_AOP_impl.OriginalCalculator.div(int,int))")
    public void ProceedingExpression() {

    }


//    返回通知可以访问到方法的返回值
//    当目标方法返回时才会启动
        @AfterReturning(value = "ProceedingExpression()",
        returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        System.out.println(joinPoint.getSignature().getName()
                + " method is ends with result : " + result);
    }

//    在目标方法抛出异常时才会启动
    @AfterThrowing(value = "ProceedingExpression()"
    , throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Exception e) {
        System.out.println(joinPoint.getSignature().getName() + " method is ends with exception : " + e);
    }

    /**
     * 环绕通知相当于代理方法的全过程，必须要带一个ProceedingJointpoint参数
     * @param proceedingJoinPoint
     * */
    @Around(value = "execution(public int cnjxufe.beans_13_AOP_impl.OriginalCalculator.mul(int,int ))")
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
