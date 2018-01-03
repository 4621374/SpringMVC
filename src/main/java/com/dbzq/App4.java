package com.dbzq;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dbzq.po.Item;
import com.dbzq.sec.ItemAction;
import com.dbzq.sec.ItemDAO;

public class App4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean4.xml");
		//ItemDAO itemDAO=(ItemDAO) applicationContext.getBean("itemDAO");
		//itemDAO.save();
		ItemAction itemAction=(ItemAction) applicationContext.getBean("itemAction");
		itemAction.addItem();
		
		

	}


}
