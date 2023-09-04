package com.gl.lab1.credential.generator.services;

import com.gl.lab1.credentials.generator.models.Employee;

public interface ICredentialService {
	public void generateEmail(Employee employee);

	public void generatePassword(Employee employee);

	public void showCredentials(Employee employee);
}
