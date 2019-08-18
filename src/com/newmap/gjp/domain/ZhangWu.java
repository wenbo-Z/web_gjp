package com.newmap.gjp.domain;
/*
创建数据表,表名账务
字段,列
主键
分类名称  可变字符
金额  double
账户  可变字符 (支付,收入方法)
创建日期 date
账务描述 可变字符

 zwid INT PRIMARY KEY AUTO_INCREMENT,
   -- 分类名称   
   flname VARCHAR(200),
   -- 金额
   money DOUBLE,
   -- 账户
   zhanghu VARCHAR(100),
   -- 创建日期
   createtime DATE,
   -- 账务描述
   description  VARCHAR(1000)
*/
public class ZhangWu {
	private int zwid;
	private String flname;
	private double money;
	private String zhanghu;
	private String createtime;
	private String description;
	
	public ZhangWu() {}
	
	public ZhangWu(int zwid, String flname, double money, String zhanghu, String createtime, String description) {
		super();
		this.zwid = zwid;
		this.flname = flname;
		this.money = money;
		this.zhanghu = zhanghu;
		this.createtime = createtime;
		this.description = description;
	}

	public int getZwid() {
		return zwid;
	}

	public void setZwid(int zwid) {
		this.zwid = zwid;
	}

	public String getFlname() {
		return flname;
	}

	public void setFlname(String flname) {
		this.flname = flname;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getZhanghu() {
		return zhanghu;
	}

	public void setZhanghu(String zhanghu) {
		this.zhanghu = zhanghu;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
		return "ZhangWu [zwid=" + zwid + ", flname=" + flname + ", money=" + money + ", zhanghu=" + zhanghu
				+ ", createtime=" + createtime + ", description=" + description + "]";
	}
	
}
