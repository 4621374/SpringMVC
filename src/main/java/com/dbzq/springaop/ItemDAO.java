package com.dbzq.springaop;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component

public class ItemDAO implements InterfaceItemDao{
	//@Resource
	//private MyAop aop;



	public void save() {
		System.out.println("savetoDB");
		//aop.commit();
	};

}
