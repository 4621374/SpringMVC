package com.dbzq.dynamic;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class ItemDAO implements InterfaceItemDao{

	public void save() {
		System.out.println("savetoDB");
	};

}
