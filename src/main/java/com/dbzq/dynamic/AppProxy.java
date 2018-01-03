package com.dbzq.dynamic;

import com.dbzq.dynamic.ItemDAO;

public class AppProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemDAO target=new ItemDAO();
		InterfaceItemDao proxy=(InterfaceItemDao) new ProxyFactory(target).getProxyInstance();
		proxy.save();

	}

}
