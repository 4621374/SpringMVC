package com.dbzq.staticproxy;


public class AppProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemDAO target=new ItemDAO();
		ItemDaoProxy proxy=new ItemDaoProxy(target);
		proxy.save();

	}

}
