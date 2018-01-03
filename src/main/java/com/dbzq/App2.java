package com.dbzq;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dbzq.po.Item;
import com.dbzq.sec.ItemAction;

public class App2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
		ItemAction itemAction=(ItemAction) applicationContext.getBean("itemAction");
		itemAction.addItem();
		
		

	}


}
