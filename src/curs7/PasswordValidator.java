package curs7;

import java.util.Scanner;

public class PasswordValidator {
	
	Scanner scan = new Scanner(System.in);
	String username;
	String password;
	boolean isInvalid;
	
	public void printPasswordRules() {
		System.out.println("Regulile parolei sunt:");
		System.out.println("1.Minim 10 caractere");
		System.out.println("2.Cel putin 1 uppercase");
		System.out.println("3.Diferita de username");
	}
	
	public void getUsername() {
		System.out.println("Introdu un username:");
		
		username = scan.next();
		
	}
	
	public void getPassword() {
		System.out.println("Introdu o parola:");
		password = scan.next();
		
	}
	
	public void checkPasswordRules() {
		
		isInvalid = false;
		
		if(password.length() < 10) {
			System.out.println("1.Parola trebuie sa fie de minim 10 caractere");
			isInvalid = true;
		}
		
		if(password.equals(password.toLowerCase())) {
			System.out.println("2.Parola trebuie sa contina cel putin 1 caracter upperCase");
			isInvalid = true;
			
		}
		
		if(password.equals(username)) {
			System.out.println("3.Parola trebuie sa fie diferita de username");
			isInvalid = true;
		}
		
	}
	
	public void validatePassword() {
		
		do {
			getPassword();
			checkPasswordRules();
			
		}while(isInvalid); //isValid == false
		System.out.println("Parola valid!");
	}

}
