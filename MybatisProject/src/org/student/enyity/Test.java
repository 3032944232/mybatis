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
////			û��ͨ���ӿ�ʵ�ֵ���ͨ��xml����s��Сд
//			Student student = session.selectOne("allstudent",1);
//			System.out.println(student);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	//��ѯ��ѧ�Ų�ѯȫ��ѧ��
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
	//��ѯȫ��
	public static void allStudent() {
		try {
			Reader reader = Resources.getResourceAsReader("conf.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			SqlSession session = sqlSessionFactory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			//���ѧ��һ��ѧ���Ų���
			List<Student> allStudent = mapper.allstudent();
			System.out.println(allStudent);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// һ��һ��ѯ ͨ��ʵ����չ��
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
//	ͨ��mapʵ��һ��һ
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
	