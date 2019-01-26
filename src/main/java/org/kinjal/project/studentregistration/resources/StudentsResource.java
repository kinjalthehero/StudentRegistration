package org.kinjal.project.studentregistration.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.kinjal.project.studentregistration.model.Student;
import org.kinjal.project.studentregistration.service.StudentService;


@Path("/students")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class StudentsResource {
	
	List<Student> students = new ArrayList<>();
	
	private StudentService studentService = new StudentService();
	
	@GET
	public List<Student> getProfiles() {
		return studentService.getAllStudents();
	}
	
	@POST
	public Student addProfile(Student profile) {
		return studentService.addStudent(profile);
	}
	
	@GET
	@Path("/{studentId}")
	public Student getProfile(@PathParam("studentId") Long id) {
		return studentService.getStudent(id);
	}
	
	@PUT
	@Path("/{studentId}")
	public Student updateProfile(@PathParam("studentId") Long id, Student student) {
		student.setStudentId(id);
		return studentService.updateStudent(student);
	}
	
	@DELETE
	@Path("/{studentId}")
	public void deleteProfile(@PathParam("studentId") Long id) {
		studentService.removeProfile(id);
	}
}
