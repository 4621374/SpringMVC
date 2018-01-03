package com.dbzq.AOP;

import org.springframework.stereotype.Component;

@Component
public class MyAop {
  public void commit() {
	  System.out.println("commit");
  }
}
