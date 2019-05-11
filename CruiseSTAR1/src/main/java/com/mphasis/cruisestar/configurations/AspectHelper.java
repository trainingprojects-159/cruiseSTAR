package com.mphasis.cruisestar.configurations;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectHelper {

	@Before("execution(* com.mphasis.cruisestar.*.*.*(..))")
	public void beforeDaoMethods(JoinPoint joinpoint)
	{
		System.out.println("before"+joinpoint.getSignature());
		System.out.println(joinpoint.getSignature().getName());
		
	}

	@After("execution(* com.mphasis.cruisestar.*.*.*(..))")
	public void afterDaoMethods(JoinPoint joinpoint)
	{
		System.out.println("after"+joinpoint.getSignature());
		System.out.println(joinpoint.getSignature().getName());
		
	}

	
}