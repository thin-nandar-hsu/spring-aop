package com.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class MyCurrencyServiceAspect {

    @Pointcut("within(com.demo.service.*)")
    public void withinPointCut(){

    }

    @Before("withinPointCut()")
    public void beforeCurrencyAdvice(JoinPoint joinPoint){
        System.out.println(
                String.format("%s is invoked after with: [%s]",
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()))
        );

    }
}
