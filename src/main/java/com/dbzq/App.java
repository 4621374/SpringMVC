package com.dbzq;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dbzq.po.Item;
import com.dbzq.sec.ItemAction;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		Item item =(Item) applicationContext.getBean("item");
		System.out.println(item.toString());
		Item item1 =(Item) applicationContext.getBean("item1");
		System.out.println(item1.toString());
		applicationContext.destroy();
		
		

	}

}
