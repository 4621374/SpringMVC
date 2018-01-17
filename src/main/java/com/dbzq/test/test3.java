package com.dbzq.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import com.dbzq.po.Order;
import com.dbzq.po.OrderCustom;
import com.dbzq.po.User;
import com.zxj.mapper.OrderCustomMapper;
import com.zxj.mapper.UserMapper;

public class test3 {
	SqlSessionFactory sqlSessionFactory=null;
	@Before
	public void InitBinder() throws IOException {
		//this.getClass().getClassLoader().getResourceAsStream("stencilset.json");
		InputStream inputStream=Resources.getResourceAsStream("SqlMapConfig3.xml");
		sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		
	}
	

	@org.junit.Test
	public void test() throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		OrderCustomMapper orderCustomMapper=sqlSession.getMapper(OrderCustomMapper.class);
		System.out.println(orderCustomMapper.toString());	
		//List<OrderCustom> orderCustomlist=(List<OrderCustom>) orderCustomMapper.findOrderUserlist();
		List<Order> orderlist=(List<Order>) orderCustomMapper.findOrderUserlistMap();
	
		sqlSession.close();
		//for (OrderCustom ordercustom:orderCustomlist)
		for (Order order:orderlist)
		System.out.println(order.toString());
	}
	@org.junit.Test
	public void test2() throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		OrderCustomMapper orderCustomMapper=sqlSession.getMapper(OrderCustomMapper.class);
		System.out.println(orderCustomMapper.toString());	
		//List<OrderCustom> orderCustomlist=(List<OrderCustom>) orderCustomMapper.findOrderUserlist();
		List<Order> orderlist=(List<Order>) orderCustomMapper.findOrderDetaillistMap();
	
		sqlSession.close();
		//for (OrderCustom ordercustom:orderCustomlist)
		for (Order order:orderlist)
		System.out.println(order.toString());
	}
}
