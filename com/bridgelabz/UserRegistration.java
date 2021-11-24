package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	Scanner sc = new Scanner(System.in);
	public void checkFirstName(){
		System.out.print("Enter First Name of User: " );
		String  fName = sc.next();
		boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", fName);
		if (check)
			System.out.println("Perfect! First #Name");
		else
			System.out.println("Please Enter a valid First Name");
	} 
	public void checkLastName(){

		System.out.print("Enter Last Name of User: " );
		String  lName = sc.next();
		boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", lName);
		if (check)
			System.out.println("Perfect! Last #Name");
		else
			System.out.println("Please Enter a Valid Last Name with Only \"One Starting Capital\" latter");
	}

    public void enterValidEmail(){
        
        System.out.print("Enter Email of User: " );
        String  eMail = sc.next();
        boolean check = Pattern.matches("^[a-z]*([.]?[a-z]+)*@bl[.]co([.]?in)*", eMail);
        if (check)
            System.out.println("Perfect! #Email!");
        else
            System.out.println("Please Enter a Valid Email with Only \"example.abc@bl.co.in\" latter");
    }
	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();

		System.out.println("Welcome to User Registration Program");

		user.checkFirstName();
		user.checkLastName();
		user.enterValidEmail();
	}
}

