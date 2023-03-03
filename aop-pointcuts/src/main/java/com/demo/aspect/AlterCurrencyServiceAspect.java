package com.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class AlterCurrencyServiceAspect {

    //@After("target(com.demo.service.AlterCurrencyService)")
    public void afterAlterCurrencyServiceAspect(JoinPoint joinPoint){
        System.out.println(
                String.format("%s is invoked after with: [%s]",
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()))
        );

    }

}
