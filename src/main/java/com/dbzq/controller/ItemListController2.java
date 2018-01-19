package com.dbzq.controller;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import com.dbzq.po.Item;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class ItemListController2 implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
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
			
	
		arg0.setAttribute("items", itemlist);
		arg0.getRequestDispatcher("WEB-INF/JSP/ItemList.jsp").forward(arg0, arg1);
	}
	


}
