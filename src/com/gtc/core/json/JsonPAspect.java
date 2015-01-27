package com.gtc.core.json;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class JsonPAspect {

    @Around("@annotation(com.gtc.core.json.JSONP)")
    public Object doAspectAction(ProceedingJoinPoint pjp) throws Throwable {
        Object returnObj = pjp.proceed();
        Object[] args = pjp.getArgs();
        System.out.println("Access JsonPAspect");
        return returnObj;
    }
}
