package com.dbzq.jdbc;


import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.core.style.ValueStyler;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.Statement;

@Component
public class ItemDAO {
    @Resource
	private DataSource dataSource;
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
	}


	public void save() throws SQLException {
		Connection connection= dataSource.getConnection();
		java.sql.Statement statement=connection.createStatement();
		
	String sql="insert into Users(username,age) values('test',1)";
	statement.executeQuery(sql);
	statement.close();
	connection.close();
	
	};

}
