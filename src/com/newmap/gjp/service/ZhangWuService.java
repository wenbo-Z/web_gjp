package com.newmap.gjp.service;

import java.util.List;

import com.newmap.gjp.dao.ZhangWuDao;
import com.newmap.gjp.domain.ZhangWu;

public class ZhangWuService {
	private ZhangWuDao dao = new ZhangWuDao();

	public List<ZhangWu> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}
}
