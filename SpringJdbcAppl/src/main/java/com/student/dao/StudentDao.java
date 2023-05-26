package com.student.dao;

import com.student.bean.Student;

public interface StudentDao {

	public boolean addStudent(Student stud);

	public boolean updateStudent(Student stud);

	public boolean deleteStudent(int sno);

}
