package org.kinjal.project.studentregistration.database;

import java.util.ArrayList;
import java.util.List;

import org.kinjal.project.studentregistration.model.Email;
import org.kinjal.project.studentregistration.model.Student;

public class DatabaseClass {
	
	private static List<Student> students = new ArrayList<>();
	private static List<Email> emails = new ArrayList<>();
	
	public static List<Student> getStudents() {
		return students;
	}
	
	public static List<Email> getEmails() {
		return emails;
	}

}
