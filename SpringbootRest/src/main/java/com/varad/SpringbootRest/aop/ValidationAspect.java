package com.varad.SpringbootRest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidationAspect {
    public static final Logger LOGGER = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(* com.varad.SpringbootRest.Service.JobService.getJob(..)) && args(id)")
    public Object validateAndUpdate(ProceedingJoinPoint jp,int id) throws Throwable {
        LOGGER.info("Id is negative updating");
        if(id < 0){
            id = -id;
        }
        Object obj = jp.proceed(new Object[]{id});


        return obj;

    }
}
