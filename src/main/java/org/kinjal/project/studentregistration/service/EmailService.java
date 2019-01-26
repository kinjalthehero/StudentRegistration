package org.kinjal.project.studentregistration.service;

import java.security.SecureRandom;

public class EmailService {

	private String emailAddress;
	private String password;
	private static final String ALPHABET = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_";
	private static final SecureRandom RANDOM = new SecureRandom();
	private String domainName = "northeastern.edu";

	public String generateEmail(String firstName, String lastName, String department) { 
		emailAddress = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + domainName;
		assignRandomPassword(); 
		return emailAddress; 
	}
	
	public String assignRandomPassword() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8; i++)
			sb.append(ALPHABET.charAt(RANDOM.nextInt((ALPHABET.length()))));
		return sb.toString();
		//this.password = sb.toString();
	}

	public String setNewPassword(String newPassword) {
		return newPassword;
	}

}
