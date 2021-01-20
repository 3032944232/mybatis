package org.student.enyity;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.student.mapper.StudentMapper;


public class Test {
//	public static void allStudent() {
//		try {
//			Reader reader = Resources.getResourceAsReader("conf.xml");
//			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//			SqlSession session = sqlSessionFactory.openSession();
////			没有通过接口实现的是通过xml所以s是小写
//			Student student = session.selectOne("allstudent",1);
//			System.out.println(student);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	//查询按学号查询全部学生
	public static void allstudentBystuno() {
		try {
			Reader reader = Resources.getResourceAsReader("conf.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			SqlSession session = sqlSessionFactory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			Student allStudent = mapper.allstudentBystuno(1);
			System.out.println(allStudent);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//查询全部
	public static void allStudent() {
		try {
			Reader reader = Resources.getResourceAsReader("conf.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			SqlSession session = sqlSessionFactory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			//多个学生一个学生放不下
			List<Student> allStudent = mapper.allstudent();
			System.out.println(allStudent);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 一对一查询 通过实践扩展类
	public static void queryStudentAndCardById() {
		try {
			Reader reader = Resources.getResourceAsReader("conf.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			SqlSession session = sqlSessionFactory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			StudentAndCard student = mapper.queryStudentAndCardById(1);
			System.out.println(student);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
//	通过map实现一对一
	public static void qStudentAndCardById() {
		try {
			Reader reader = Resources.getResourceAsReader("conf.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			SqlSession session = sqlSessionFactory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			Student student = mapper.qStudentAndCardById(1);
			System.out.println(student);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
//		allStudent();
//		allstudentBystuno();
//		queryStudentAndCardById();
		qStudentAndCardById();

	}
	
}
	