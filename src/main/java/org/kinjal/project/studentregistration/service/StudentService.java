package org.kinjal.project.studentregistration.service;

import java.util.ArrayList;
import java.util.List;

import org.kinjal.project.studentregistration.database.DatabaseClass;
import org.kinjal.project.studentregistration.model.Student;

public class StudentService {
	
	private List<Student> students = DatabaseClass.getStudents();
	
	public List<Student> getAllStudents() {
		return new ArrayList<Student>(students); 
	}
	
	public Student addProfile(Student student) {
		students.add(student);
		return student;
	}
}
