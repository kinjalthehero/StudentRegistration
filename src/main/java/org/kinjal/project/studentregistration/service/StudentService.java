package org.kinjal.project.studentregistration.service;

import java.util.ArrayList;
import java.util.List;

import org.kinjal.project.studentregistration.database.DatabaseClass;
import org.kinjal.project.studentregistration.model.Email;
import org.kinjal.project.studentregistration.model.Student;

public class StudentService {
	
	private static List<Student> students = DatabaseClass.getStudents();
	
	public List<Student> getAllStudents() {
		return new ArrayList<Student>(students); 
	}
	
	public Student addProfile(Student student) {
		
		if (student.getEmail() == null) {
			student.setEmail(new Email());
			EmailService emailObject = new EmailService();
			student.getEmail().setEmailAddress(emailObject.generateEmail(student.getFirstName(), student.getLastName(), student.getEnrolledDepartment()));
		}
		
		students.add(student);
		return student;
	}
}
