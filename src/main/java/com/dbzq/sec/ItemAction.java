package com.dbzq.sec;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//@Component
@Controller
public class ItemAction {
	@Resource
          private ItemService itemService;
          
          public void setItemService(ItemService itemService) {
			this.itemService = itemService;
		}

		public void addItem() {
			itemService.save();
        	  
          }
}
