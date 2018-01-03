package com.dbzq.sec;

import javax.annotation.Resource;

import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("itemService")
@Service
public class ItemService {
@Resource(name="itemDAO")
	private ItemDAO itemDAO;

	public void setItemDAO(ItemDAO itemDAO) {
		this.itemDAO = itemDAO;
	}
	public void save(){
		itemDAO.save();
	}

}
