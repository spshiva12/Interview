package com.mvcjdbc.queryconstant;

public interface QueryConstant {

	public static String update = "Update springmvcjdbc Set cname=?, email=?, address=? , telephone=? Where cid = ?";

	public static String insert = "Insert Into springmvcjdbc(cname,email,address, telephone) Values(?,?,?,?)";

	public static String delete = " Delete From springmvcjdbc Where cid=?";

	public static String list = "Select * From springmvcjdbc";

//	public static String get = "Select * From springmvcjdbc Where cid = ?";

}
