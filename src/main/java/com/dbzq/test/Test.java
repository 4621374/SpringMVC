package com.dbzq.test;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;


public class Test {
	SqlSessionFactory sqlSessionFactory=null;
	@Before
	public void InitBinder() {
		this.getClass().getClassLoader().getResourceAsStream("stencilset.json");
		
	}
	

	@org.junit.Test
	public void test() {
		fail("Not yet implemented");
	}

}
