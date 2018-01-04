package com.dbzq.jdbc;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
@Service
public class ItemService {
	@Resource
	private ItemDAO itemDAO;

	public void setItemDAO(ItemDAO itemDAO) {
		this.itemDAO = itemDAO;
	}
   public void save(Item item) throws Exception {
	   
	   itemDAO.save(item);
	   int i=1/0;
	   itemDAO.save(item);
   }
}
