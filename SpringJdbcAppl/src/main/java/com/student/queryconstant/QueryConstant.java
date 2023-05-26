package com.student.queryconstant;

public class QueryConstant {

	public static String add_Query = "Insert Into studentspring(sid,sname, sadd) values(?,?,?)";

	public static String update_Query = "Update studentspring Set sname =? Where sid=?";

	public static String delete_Query = "Delete From studentspring Where sid =?";

}
