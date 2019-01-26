package org.kinjal.project.studentregistration.database;

import java.util.HashMap;
import java.util.Map;
import org.kinjal.project.studentregistration.model.Student;

public class DatabaseClass {
	
	private static Map<Long, Student> students = new HashMap<>();
	
	public static Map<Long, Student> getStudents() {
		return students;
	}
}
