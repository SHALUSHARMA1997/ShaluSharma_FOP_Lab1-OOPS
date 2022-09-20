package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {
	public String generateEmailID(String firstName, String lastName, String department) 
	{
		return firstName.concat(lastName)+"@"+department+".greatlearning.com";
		
	}
	public String generatePassword()
	{
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String number = "0123456789";
		String specialCharacters = "!@#$%^&*_+=-/?<>" ;
		Random randomNumber = new Random();
		String password = "";
		
		password1 +=capitalLetter.charAt(randomNumber.nextInt(capitalLetter.length()));
		password2 +=smallLetter.charAt(randomNumber.nextInt(smallLetter.length()));
			
		for (int i=0; i<8; i++) {
			
		password +=capitalLetter.charAt(randomNumber.nextInt(capitalLetter.length()));
		}
		return password;
		
		
	}

}


}
