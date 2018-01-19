package com.dbzq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dbzq.po.ItemQuerVo;
import com.dbzq.po.ItemsCustom;
import com.zxj.mapper.ItemsCustomMapper;

public class ItemsServiceImp1 implements ItemsService {
	@Autowired
	private ItemsCustomMapper itemsCustomMapper;

	@Override
	public List<ItemsCustom> findItemlist(ItemQuerVo itemQuerVo) throws Exception {
		// TODO Auto-generated method stub
		return itemsCustomMapper.findItemlist(itemQuerVo);
	}

}
