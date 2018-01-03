package com.dbzq.cglib;

public class AppProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemDAO target=new ItemDAO();
		ItemDAO proxy=(ItemDAO) new ProxyFactory(target).getProxyInstance();
		proxy.save();

	}

}
