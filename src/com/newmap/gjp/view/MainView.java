package com.newmap.gjp.view;

import java.util.List;
import java.util.Scanner;

import com.newmap.gjp.controller.ZhangWuController;
import com.newmap.gjp.domain.ZhangWu;

public class MainView {
	private ZhangWuController controller = new ZhangWuController();
	
	/*
	 * 实现界面效果
	 * 接收用户输入
	 * 
	 */
	public void run() {
		Scanner scanner = new Scanner(System.in);
		while(true){
			
			System.out.println("---------------管家婆家庭记账软件---------------");
			System.out.println("1.添加账务　2.编辑账务　3.删除账务　4.查询账务　5.退出系统");
			System.out.println("请输入要操作的功能序号[1-5]:");
			//接收用户的菜单选择
			int choose = scanner.nextInt();
			//对选择的菜单判断,调用不同的功能
			switch(choose){
			case 1:
			   // 选择添加账务,调用添加账务的方法
				//addZhangWu();
				break;
			case 2:
				// 选择的编辑账务,调用编辑账务方法
				//editZhangWu();
				break;
			case 3:
				// 选择的删除账务,调用删除账务方法
				//deleteZhangWu();
				break;
			case 4:
				// 选择的是查询账务,调用查询方法
				selectZhangWu();
				break;
			case 5:
				System.exit(0);
				break;
			}
		}
	}

	private void selectZhangWu() {
		System.out.println("1. 查询所有    2. 条件查询");
		Scanner sc = new Scanner(System.in);
		switch (sc.nextInt()) {
		case 1:
			selectAll();
			break;
		
		case 2:
			
			break;
		}
	}

	private void selectAll() {
		List<ZhangWu> list = controller.selectAll();
		
		if(list.size()!=0) {
			System.out.println("ID\t类别\t账户\t金额\t时间\t说明");
			
			for(ZhangWu zw:list) {
				System.out.println(zw.getZwid()+"\t"+zw.getFlname()+"\t"+zw.getZhanghu()+"\t"+zw.getMoney()+"\t"+zw.getCreatetime()+"\t"+zw.getDescription());
			}
			
		}else {
			System.out.println("没有查询到数据");
		}
			 
	}
}
