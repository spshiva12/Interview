package com.mvcjdbc.daoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.validation.BeanPropertyBindingResult;

import com.mvcjdbc.dao.ContactDao;
import com.mvcjdbc.pojo.Contact;
import com.mvcjdbc.queryconstant.QueryConstant;

public class ContactDaoImpl implements ContactDao {

	private static JdbcTemplate jdbcTemplate;

	public ContactDaoImpl(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate();
	}

	public void saveorupdate(Contact con) {

		if (con.getId() > 0) {
			// update
			jdbcTemplate.update(QueryConstant.update, con.getName(), con.getAddress(), con.getEmail(),
					con.getTelephone());

		} else {
			// insert
			jdbcTemplate.update(QueryConstant.insert, con.getName(), con.getAddress(), con.getEmail(),
					con.getTelephone());
		}

	}

	public void delete(int cid) {
		jdbcTemplate.update(QueryConstant.delete, cid);

	}

//	public Contact get(int cid) {
//		return jdbcTemplate.query(QueryConstant.get, ResultSetExtractor<Contact>()){
//			
//			
//			
//		}
//		return null;
//	}

	public List<Contact> list() {

		return jdbcTemplate.query(QueryConstant.list, BeanPropertyRowMapper.newInstance(Contact.class));
	}
 
}
