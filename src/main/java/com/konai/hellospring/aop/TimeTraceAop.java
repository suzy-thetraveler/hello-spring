package com.konai.hellospring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect //component로 bean 등록을 해도 되지만 spring config에 등록하는게 더 좋음. aop에 대한 인지성 높임.
@Component
public class TimeTraceAop {

    @Around("execution(* com.konai.hellospring..*(..))") //이 공통 관심사항을 어디에 적용할건지 설정하는것
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable{
        long start = System.currentTimeMillis();
        System.out.println("START: "+joinPoint.toString());
        try{
            return joinPoint.proceed();
        } finally {
            long finish = System.currentTimeMillis();
            long timeMs = finish-start;
            System.out.println("END: "+joinPoint.toString()+" "+timeMs+"ms");
        }

    }
}
