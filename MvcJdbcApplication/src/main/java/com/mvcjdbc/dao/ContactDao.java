package com.mvcjdbc.dao;

import java.util.List;

import com.mvcjdbc.pojo.Contact;

public interface ContactDao {
	
	public void saveorupdate(Contact con);
	
	public void delete(int cid);
	
//	public Contact get(int cid);
//	
	public List<Contact> list();

}
