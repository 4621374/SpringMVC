package com.zxj.mapper;

import java.util.List;

import com.dbzq.po.ItemQuerVo;
import com.dbzq.po.ItemsCustom;

public interface ItemsCustomMapper {
	public List<ItemsCustom> findItemlist(ItemQuerVo itemQuerVo) throws Exception;

}
