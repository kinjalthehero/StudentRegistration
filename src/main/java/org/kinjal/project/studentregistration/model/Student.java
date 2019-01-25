package org.kinjal.project.studentregistration.model;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.kinjal.project.studentregistration.service.EmailService;

@XmlRootElement
public class Student {
	
	private String firstName;
    private String lastName;
    private String address;
    private String enrolledDepartment;
	private Date created;
	private Email email;
	EmailService emailObject;
	
    
    public Student() {
    	this.firstName = "";
        this.lastName = "";
        this.address = "";
        this.enrolledDepartment = "";
        this.created = new Date();
        this.email = null;
        this.emailObject = null;
    }
    
    public Student(String firstName, String lastName, String address, String departmentName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.enrolledDepartment = departmentName;
        this.created = new Date();
        this.emailObject = new EmailService();
        this.email = new Email();
        this.email.setEmailAddress(emailObject.generateEmail(this.firstName, this.lastName, this.enrolledDepartment));
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

}
