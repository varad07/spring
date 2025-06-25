package com.varad.SpringbootRest.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller
@Aspect
public class LoggingAspect {
    public static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    //return type,class name,method name, args
//    @Before("execution(* com.varad.SpringbootRest.Service.JobService.*(..))")
//    public void methodCalled(){
//        LOGGER.info("method called");
//    }
    @Before("execution(* com.varad.SpringbootRest.Service.JobService.getJob(..)) || execution(* com.varad.SpringbootRest.Service.JobService.updateJob(..))")
    public void methodCalled(JoinPoint jp){
        LOGGER.info("method called : "+jp.getSignature().getName());
    }
    @After("execution(* com.varad.SpringbootRest.Service.JobService.getJob(..)) || execution(* com.varad.SpringbootRest.Service.JobService.updateJob(..))")
    public void methodExecuted(JoinPoint jp){
        LOGGER.info("method Executed : "+jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.varad.SpringbootRest.Service.JobService.getJob(..)) || execution(* com.varad.SpringbootRest.Service.JobService.updateJob(..))")
    public void methodCrash(JoinPoint jp){
        LOGGER.info("method has some issues : "+jp.getSignature().getName());
    }
    @AfterReturning("execution(* com.varad.SpringbootRest.Service.JobService.getJob(..)) || execution(* com.varad.SpringbootRest.Service.JobService.updateJob(..))")
    public void methodSuccess(JoinPoint jp){
        LOGGER.info("method executed successfully : "+jp.getSignature().getName());
    }

}
