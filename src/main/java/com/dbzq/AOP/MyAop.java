package com.dbzq.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAop {

	public void begincommit() {
		  System.out.println("begincommit");
	  }
	
	
    public void commit() {
	  System.out.println("commit");
     }
}
