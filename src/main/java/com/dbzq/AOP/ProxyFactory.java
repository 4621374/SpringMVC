package com.dbzq.AOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.stereotype.Component;
@Component
public class ProxyFactory {
    private static Object target;
    private static MyAop aop;

	
	public static Object getProxyInstance(Object _target,MyAop _myAop) {
		aop=_myAop;
		target=_target;
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// TODO Auto-generated method stub
						//System.out.println("extra");
						aop.commit();
						return method.invoke(target, args);
					}
				});
	}
	
    
}
