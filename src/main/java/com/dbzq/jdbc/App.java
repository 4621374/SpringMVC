package com.dbzq.jdbc;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dbzq.po.Item;
import com.dbzq.sec.ItemAction;
import com.dbzq.jdbc.ItemDAO;

public class App {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("jdbc.xml");
		 ItemDAO itemDAO =(ItemDAO) applicationContext.getBean("itemDAO");
				
		itemDAO.save();

		
		

	}

}
