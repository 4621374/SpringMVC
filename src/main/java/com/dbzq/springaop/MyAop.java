package com.dbzq.springaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAop {
	@Before("execution(public void com.dbzq.springaop.ItemDAO.save())")
	public void begincommit() {
		  System.out.println("begincommit");
	  }
	@After("execution(public void com.dbzq.springaop.ItemDAO.save())")
    public void commit() {
	     System.out.println("commit");
     }
}
