package com.newmap.gjp.tools;
/**
 *  获取数据库连接的工具类
 *  实现dbcp连接池
 * @author ZWB
 *
 */

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class JdbcUtils {
	private static BasicDataSource dataSource = new BasicDataSource();
	
	static {
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/gjp");
		dataSource.setUsername("root");
		dataSource.setPassword("123654");
		
		dataSource.setInitialSize(10);//设置初始化连接数
		dataSource.setMaxActive(8);//设置最大连接数
		dataSource.setMaxIdle(5);//设置最大空闲数
		dataSource.setMinIdle(2);//设置最小空闲数
	}
	
	public static DataSource getDataSource() {
		return dataSource;
	}
}
