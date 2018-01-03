package com.dbzq.springaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAop {
	@Pointcut("execution(public void com.dbzq.springaop.ItemDAO.*())") 
	public void pointCut() {		
	}
	@Before("pointCut()")
	public void begincommit() {
		  System.out.println("begincommit");
	  }
	@After("execution(public void com.dbzq.springaop.ItemDAO.save())")
    public void commit() {
	     System.out.println("commit");
     }
	@AfterReturning("execution(public void com.dbzq.springaop.ItemDAO.save())")
    public void aftcommit() {
	     System.out.println("aftercommit");
     }
	@AfterThrowing("execution(public void com.dbzq.springaop.ItemDAO.save())")
    public void afterthrowing() {
	     System.out.println("afterthrowing");
     }
}
