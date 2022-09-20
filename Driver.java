package com.greatlearning.service;
import java.security.Provider.Service;
import java.util.Scanner;
import com.greatlearning.model.Employee;
public class Driver {
public static void main(String[] args) {
		
		Employee employee = new Employee("Shalu", "Sharma");
		employee.getFirstName();
		employee.getLastName();
		
		Scanner sc = new Scanner(System.in);
					
		System.out.println("please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal"); 		
		
		int option = sc.nextInt();
		Service service = new Service();
		String email = "";
 		String password = "";
		switch(option) {
		case 1:
			email =service.generateEmailId(employee.getFirstName(), employee.getLastName(), "tech");
			password= sevice.generatePassword();
			break;
		case 2:
			email =service.generateEmailId(employee.getFirstName(), employee.getLastName(), "ad");
			password= sevice.generatePassword();
			break;
		case 3:
			email =service.generateEmailId(employee.getFirstName(), employee.getLastName(), "hr");
			password= sevice.generatePassword();
			break;
		case 4:
			email =service.generateEmailId(employee.getFirstName(), employee.getLastName(), "leg");
			password= sevice.generatePassword();
			break;
			
		}
		
		System.out.println("Enter a valid option");
		System.out.println("Email:" + email);
		System.out.println("password:" +password);
		}
}


}
