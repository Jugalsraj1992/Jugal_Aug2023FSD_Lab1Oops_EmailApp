package com.gl.lab1.credential.generator.services;

import java.util.Random;

import com.gl.lab1.credentials.generator.models.Employee;

public class CredentialService implements ICredentialService {
	private String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String lower = "abcdefghijklmnopqrstuvwxyz";
	private String splChar = "!@#$%^&*";
	private String number = "0123456789";
	private String passwordChars = upper + lower + number + splChar;
	private Random random = new Random();

	@Override
	public void generateEmail(Employee employee) {
		String emailAddress = employee.getFirstName() + employee.getLastName() + "@" + employee.getDepartment()
				+ ".abc.com";
		employee.setEmailAddress(emailAddress);

	}

	@Override
	public void generatePassword(Employee employee) {

		String password = "";
		for (int i = 0; i < 8; i++) {
			password = password + passwordChars.charAt(random.nextInt(passwordChars.length()));
		}
		employee.setPassword(password);
		//for (int i = 0; i < 8; i++) {
		//password = password + random.nextInt(passwordChars.length()));
		//	}
	}

	@Override
	public void showCredentials(Employee employee) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email \t--->" + employee.getEmailAddress());
		System.out.println("Password--->" + employee.getPassword());

	}

}
