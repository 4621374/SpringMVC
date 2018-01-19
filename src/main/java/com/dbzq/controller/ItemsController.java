package com.dbzq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dbzq.jdbc.ItemService;
import com.dbzq.po.ItemsCustom;
import com.dbzq.service.ItemsService;

@Controller
public class ItemsController {
	@Autowired
	private ItemsService itemsService;
	@RequestMapping("queryItems")
	public ModelAndView queryItems() throws Exception {
		List<ItemsCustom> itemsList=itemsService.findItemlist(null);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("items",itemsList);
		modelAndView.setViewName("itemList");
		return modelAndView;
		
	}

}
