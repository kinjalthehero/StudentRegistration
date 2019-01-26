package org.kinjal.project.studentregistration.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	
	private Long studentId;
	private String firstName;
    private String lastName;
    private String address;
    private String enrolledDepartment;
	private Date created;
	private Email email;
	
    public Student() {
        this.created = new Date();
    }
    
    public Student(String firstName, String lastName, String address, String departmentName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.enrolledDepartment = departmentName;
        this.created = new Date();
        this.email = new Email();        
    }

	public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEnrolledDepartment() {
        return enrolledDepartment;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEnrolledDepartment(String enrolledDepartment) {
        this.enrolledDepartment = enrolledDepartment;
    }

    public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}
	
	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
}
