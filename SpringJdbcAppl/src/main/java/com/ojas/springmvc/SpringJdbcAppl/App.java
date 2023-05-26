package com.ojas.springmvc.SpringJdbcAppl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.bean.Student;
import com.student.daoimpl.StudentDaoImpl;

/**
 * Hello world!
 *
 */
public class App {

	static ApplicationContext appl = new ClassPathXmlApplicationContext(
			"com\\student\\controller\\controller.xml");
	static StudentDaoImpl impl = (StudentDaoImpl) appl.getBean("studentdata");

	public static void addClient() {
		Student stu = new Student();
		stu.setSid(108);
		stu.setSname("shivakalyan");
		stu.setSadd("Ladakh");

		boolean addStudent = impl.addStudent(stu);

		if (addStudent) {
			System.out.println("inserted successfully");
		} else {

			System.out.println("not inserted");

		}

	}

	public static void updateClient() {
		Student stu = new Student();
		stu.setSid(106);
		stu.setSname("shivaprasad");
		stu.setSadd("Ladakh");

		boolean updateStudent = impl.updateStudent(stu);

		if (updateStudent) {
			System.out.println(" Updated: ");
		} else {
			System.out.println(" not updated: ");
		}
	}

	public static void deleteClient() {
		
		int sid = 106;
		
		boolean deleteStudent = impl.deleteStudent(sid);

		if (deleteStudent) {
			System.out.println(" deleted: ");
		} else {
			System.out.println(" not deleted: ");
		}

	}

	public static void main(String[] args) {

//		addClient();	
//		updateClient();
		deleteClient();

	}
}
