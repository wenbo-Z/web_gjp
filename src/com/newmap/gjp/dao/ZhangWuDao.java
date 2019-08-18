package com.newmap.gjp.dao;
/*
 * 实现对数据表gjp_zhangwu表的增删改查操作
 */

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.newmap.gjp.domain.ZhangWu;
import com.newmap.gjp.tools.JdbcUtils;

public class ZhangWuDao {
	private QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());

	public List<ZhangWu> selectAll() {
		try {
			String sql = "select * from gjp_zhangwu";
			List<ZhangWu> list = qr.query(sql, new BeanListHandler<ZhangWu>(ZhangWu .class));
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("账务查询失败！");
		}
	}
}
