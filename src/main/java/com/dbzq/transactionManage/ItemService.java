package com.dbzq.transactionManage;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class ItemService {
	@Resource
	private ItemDAO itemDAO;

	public void setItemDAO(ItemDAO itemDAO) {
		this.itemDAO = itemDAO;
	}
	@Transactional
   public void save(Item item) throws Exception {
	   
	   itemDAO.save(item);
	   int i=1/0;
	   itemDAO.save(item);
   }
}
