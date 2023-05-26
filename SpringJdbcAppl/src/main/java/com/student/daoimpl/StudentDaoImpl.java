package com.student.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.student.bean.Student;
import com.student.queryconstant.QueryConstant;

public class StudentDaoImpl {
	@Autowired
	private JdbcTemplate jt;

	public boolean addStudent(Student stu) {

		int count = jt.update(QueryConstant.add_Query, stu.getSid(), stu.getSname(), stu.getSadd());
		boolean flag = true;

		if (count != 0) {
			flag = true;
		}

		return flag;
	}

	public boolean updateStudent(Student stud) {

		int count = jt.update(QueryConstant.update_Query,  stud.getSname(),stud.getSid());
		boolean flag = true;

		if (count != 0) {
			flag = true;
		}

		return flag;
	}

	public boolean deleteStudent(int sno) {

		int count = jt.update(QueryConstant.delete_Query, sno);
		boolean flag = true;

		if (count != 0) {
			flag = true;
		}

		return flag;

	}

}
