package com.gl.lab1.credential.generator.Driver;

import java.util.Scanner;
import com.gl.lab1.credential.generator.services.CredentialService;
import com.gl.lab1.credential.generator.services.ICredentialService;
import com.gl.lab1.credentials.generator.models.Employee;

public class Driver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ICredentialService service = new CredentialService();
		
		System.out.println("Please Enter your First Name.");
		String firstName = sc.nextLine();
		
		System.out.println("Please Enter your Last Name.");
		String lastName = sc.nextLine();
		
		Employee employee = new Employee(firstName,lastName);
			System.out.println("Please Enter the department from the following");
			System.out.println("1.Technical");
			System.out.println("2.Admin");
			System.out.println("3.Human Resource");
			System.out.println("4.Legal");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				employee.setDepartment("tech");
				break;
			case 2:
				employee.setDepartment("admin");
				break;
			case 3:
				employee.setDepartment("hr");
				break;
			case 4:
				employee.setDepartment("log");
				break;
			case 0:
				System.out.println("Successfully logged out..!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Option");
			}
			if(employee.getFirstName() != null && employee.getLastName() != null && employee.getDepartment() != null) {
				service.generateEmail(employee);
				service.generatePassword(employee);
				service.showCredentials(employee);
			}else {
				System.out.println("Invalid Employee Details");
			}	
			
	}
}
