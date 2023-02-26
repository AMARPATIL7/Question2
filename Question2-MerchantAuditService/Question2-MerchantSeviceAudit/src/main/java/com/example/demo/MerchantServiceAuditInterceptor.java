package com.example.demo;

import java.util.*;

 
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
 
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MerchantServiceAuditInterceptor {
    
    
    @Before("execution(* com.example.demo.MerchantService.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Executing method: {}" + joinPoint.getSignature());
        System.out.println(" arguments of method: {}" + Arrays.toString(joinPoint.getArgs()));
    }
    
    @AfterReturning(pointcut = "execution(* com.example.demo.MerchantService.*(..))", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
    	 System.out.println("Method execution successful: {}"+ joinPoint.getSignature());
    	 System.out.println("Result: {}"+ result);
    }
    
    @AfterThrowing(pointcut = "execution(* com.example.demo.MerchantService.*(..))", throwing = "error")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
    	 System.out.println("Method execution failed: {}" + joinPoint.getSignature() + error);
    }
}