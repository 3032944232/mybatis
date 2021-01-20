package org.student.mapper;

import java.util.List;

import org.student.enyity.Student;
import org.student.enyity.StudentAndCard;

public interface StudentMapper {
	Student allstudentBystuno(int stuno);
	List<Student> allstudent();
	Student queryStudentByIdMap(int stuno);
	StudentAndCard queryStudentAndCardById(int stuno);
	Student qStudentAndCardById(int stuno);
}
