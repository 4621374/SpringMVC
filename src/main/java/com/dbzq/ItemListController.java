package com.dbzq;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.dbzq.po.Item;

public class ItemListController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Item> itemlist=new ArrayList<Item>();
		Item item1=new Item();
		item1.setName("����");
		item1.setPrice(1000);
		item1.setDetail("����a123");
		Item item2=new Item();
		item2.setName("dell");
		item2.setPrice(2000);
		item2.setDetail("�������e740");
		itemlist.add(item1);
		itemlist.add(item2);
		ModelAndView model1=new ModelAndView();
	
		model1.addObject("items",itemlist);
		model1.setViewName("WEB-INF/JSP/ItemList.jsp");
		return model1;
		
	}

}
