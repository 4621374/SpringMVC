package com.dbzq.cglib;


import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class ProxyFactory implements MethodInterceptor {
private Object target;

	public ProxyFactory(Object target) {
	super();
	this.target = target;
}
	public  Object getProxyInstance() {
		// TODO Auto-generated method stub
		Enhancer enhancer=new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(this);
		return enhancer.create();

	}
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("extra");
		return arg1.invoke(target, arg2);
		
	}




}
