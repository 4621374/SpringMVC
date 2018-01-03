package com.dbzq.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dbzq.po.Item;
import com.dbzq.sec.ItemAction;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("aop-aspect.xml");
		InterfaceItemDao itemDAO =(InterfaceItemDao) applicationContext.getBean("itemDAO");
		//ProxyFactory proxyFactory =(ProxyFactory) applicationContext.getBean("proxyFactory");
		
		itemDAO.save();

		
		

	}

}
