package com.dbzq.jdbc;

import java.sql.SQLException;
import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dbzq.sec.ItemAction;
import com.dbzq.jdbc.ItemDAO;

public class App {
	ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("jdbc.xml");
	
	@Test
	public void test2() throws Exception {
		// TODO Auto-generated method stub
		
		 ItemService itemService =(ItemService) applicationContext.getBean("itemService");
				Item item=new Item();
				item.setName("zhangsan4");
				item.setPrice(111);
		itemService.save(item);
		 

		
		

	}

}
