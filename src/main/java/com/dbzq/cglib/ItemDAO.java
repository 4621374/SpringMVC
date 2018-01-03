package com.dbzq.cglib;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dbzq.staticproxy.InterfaceItemDao;

//@Component
@Repository
public class ItemDAO {

	public void save() {
		System.out.println("savetoDB");
	};

}
