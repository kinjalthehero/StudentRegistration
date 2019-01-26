package org.kinjal.project.studentregistration.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.kinjal.project.studentregistration.database.DatabaseClass;
import org.kinjal.project.studentregistration.model.Email;
import org.kinjal.project.studentregistration.model.Student;

public class StudentService {
	
	private Map<Long, Student> students = DatabaseClass.getStudents();
	
	public List<Student> getAllStudents() {
		return new ArrayList<Student>(students.values()); 
	}
	
	public Student addStudent(Student student) {
		
		student.setStudentId(students.size() + 1L);
		if (student.getEmail() == null) {
			Email email = new Email();
			EmailService emailObject = new EmailService();
			email.setEmailAddress(emailObject.generateEmail(student.getFirstName(), student.getLastName(), student.getEnrolledDepartment()));
			email.setPassword(emailObject.assignRandomPassword());
			student.setEmail(email);
		}
		students.put(student.getStudentId(), student);
		return student;
	}

	public Student getStudent(Long studentId) {
		return students.get(studentId);
	}
	
	public Student updateStudent(Student student) {
		if (student.getStudentId() <= 0) {
			return null;
		}
		students.put(student.getStudentId(), student);
		return student;
	}

	public Student removeProfile(long id) {
		return students.remove(id);
	}
}
