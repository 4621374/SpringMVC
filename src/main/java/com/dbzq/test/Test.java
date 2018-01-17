package com.dbzq.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Stream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;

import com.dbzq.po.User;

import org.apache.ibatis.io.Resources;

public class Test {
	
	SqlSessionFactory sqlSessionFactory=null;
	@Before
	public void InitBinder() throws IOException {
		//this.getClass().getClassLoader().getResourceAsStream("stencilset.json");
		InputStream inputStream=Resources.getResourceAsStream("SqlMapConfig.xml");
		sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		
	}
	

	@org.junit.Test
	public void test() {
		
		SqlSession sqlSession=sqlSessionFactory.openSession();
		//User user=(User)sqlSession.selectOne("findUserById",1);
		//List<User> users=sqlSession.selectList("findUserByName2","te");
		//sqlSession.delete("deleteUser",2);
		User user=new User("wangwu3",32,3);
		//sqlSession.insert("addUser",user);
		sqlSession.update("updateUser", user);
		sqlSession.commit();
		sqlSession.close();
		//for (User user:users)
		System.out.println(user.toString());
	}

}
