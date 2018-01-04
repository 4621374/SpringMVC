package com.dbzq.jdbc;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.aspectj.apache.bcel.generic.ReturnaddressType;
import org.springframework.core.style.ValueStyler;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.Statement;

@Component
public class ItemDAO {
    @Resource
    private JdbcTemplate jdbcTemplate;
    
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	//private DataSource dataSource;
//	public void setDataSource(DataSource dataSource) {
//		this.dataSource=dataSource;
//	}
	public List<Item> query(){
		String sql="select username,age from Users";
	//	JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		List<Map<String, Object>> list= jdbcTemplate.queryForList(sql);
		System.out.println(list);
		return null;
	}
	public List<Item> queryrow(){
		String sql="select username,age from Users";
		//JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		return jdbcTemplate.query(sql, new RowMapper<Item>() {

			@Override
			public Item mapRow(ResultSet arg0, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				Item item =new Item();
				item.setName(arg0.getString("username"));
				System.out.println(item.toString());
				return item;
			}
		
		}
				
				
				
				);
		

	}


	public void save(Item item) throws SQLException {
	//	Connection connection= dataSource.getConnection();
		String sql="insert into Users(username,age) values(?,?)";
	//	JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql,new Object[] {item.getName(),item.getPrice()});
//		java.sql.Statement statement=connection.createStatement();			
//	statement.execute(sql);
//	statement.close();
//	connection.close();
	
	};

}
