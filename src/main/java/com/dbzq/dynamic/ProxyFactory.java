package com.dbzq.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target;

	public ProxyFactory(Object target) {
		super();
		this.target = target;
	}
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// TODO Auto-generated method stub
						System.out.println("extra");
						
						return method.invoke(target, args);
					}
				});
	}
	
    
}
