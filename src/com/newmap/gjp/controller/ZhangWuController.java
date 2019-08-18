package com.newmap.gjp.controller;

import java.util.List;

import com.newmap.gjp.domain.ZhangWu;
import com.newmap.gjp.service.ZhangWuService;

public class ZhangWuController {
	private ZhangWuService service = new ZhangWuService();

	public List<ZhangWu> selectAll() {
		return service.selectAll();
	}
}
