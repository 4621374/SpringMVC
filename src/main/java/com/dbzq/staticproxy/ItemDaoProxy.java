package com.dbzq.staticproxy;

public class ItemDaoProxy implements InterfaceItemDao {
    private InterfaceItemDao target;
    
    
	public ItemDaoProxy(com.dbzq.staticproxy.InterfaceItemDao interfaceItemDao) {
		
		this.target = interfaceItemDao;
	}


	@Override
	public void save() {
		target.save();
		System.out.println("extra_function");

	}

}
