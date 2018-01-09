package com.dbzq.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import com.dbzq.po.User;
import com.zxj.mapper.UserMapper;

public class test2 {
	SqlSessionFactory sqlSessionFactory=null;
	@Before
	public void InitBinder() throws IOException {
		//this.getClass().getClassLoader().getResourceAsStream("stencilset.json");
		InputStream inputStream=Resources.getResourceAsStream("SqlMapConfig2.xml");
		sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		
	}
	

	@org.junit.Test
	public void test() {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		System.out.println(userMapper.toString());	
		User user=userMapper.findUserById(3);
		
	
		sqlSession.close();
		//for (User user:users)
		System.out.println(user.toString());
	}
}
