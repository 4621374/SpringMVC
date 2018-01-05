package com.dbzq.transactionManage;

import java.sql.SQLException;
import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("transactionManage.xml");
	
	@Test
	public void test2() throws Exception {
		// TODO Auto-generated method stub

		 ItemService itemService =(ItemService) applicationContext.getBean("itemService");
				Item item=new Item();
				item.setName("zhangsan5");
				item.setPrice(111);
		itemService.save(item);
		 

		
		

	}

}
