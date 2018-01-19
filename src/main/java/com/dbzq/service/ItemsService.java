package com.dbzq.service;

import java.util.List;

import com.dbzq.po.ItemQuerVo;
import com.dbzq.po.ItemsCustom;

public interface ItemsService {
	public List<ItemsCustom> findItemlist(ItemQuerVo itemQuerVo) throws Exception;


}
