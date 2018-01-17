package com.zxj.mapper;

import java.util.List;

import com.dbzq.po.Order;
import com.dbzq.po.OrderCustom;

public interface OrderCustomMapper {
  public List<OrderCustom> findOrderUserlist() throws Exception;
  public List<Order> findOrderUserlistMap() throws Exception;
  public List<Order> findOrderDetaillistMap() throws Exception;
  
	  
  
}
