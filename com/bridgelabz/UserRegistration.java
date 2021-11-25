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
    public void validMobileNum(){
       
        System.out.print("Enter Mobile number with country code (91)  : " );
        String mobileNum = sc.nextLine();
        boolean check = Pattern.matches("^91\\s[6789][0-9]{9}", mobileNum);
        if (check)
            System.out.println("Perfect! Mobile #Num");
        else
            System.out.println("Please Enter a Valid Mobile Num ex:- 90 9533182605");
    }
    public void checkPassWordRule1(){
       
        System.out.print("Enter password :  ");
        String password = sc.nextLine();
        boolean check = Pattern.matches("[a-zA-Z]{8,}", password);
        if (check)
            System.out.println("Perfect! #password");
        else
            System.out.println("Please Enter a Valid password, it should have minimum 8 characters");
    }
    public void checkPassWordRule2(){
        
        System.out.print("Enter password :  ");
        String passWord = sc.nextLine();
        boolean check = Pattern.matches("[A-Z]{1}[a-z]{7,}", passWord);
        if (check)
            System.out.println("Perfect! #password");
        else
            System.out.println("Please Enter a Valid password, it should have minimum 8 characters with 1 upper case");
    }
    public void checkPassWordRule3(){
      
        System.out.print("Enter password :  ");
        String passWord = sc.nextLine();
        boolean check = Pattern.matches("[A-Z]{1}[a-z]{6,}[0-9]{1}", passWord);
        if (check)
            System.out.println("Perfect! #password");
        else
            System.out.println("Please Enter a Valid password, it should have minimum 8 characters with, 1 upper case and 1 Numeric ");
    }
    public void checkPassWordRule4(){
       
        System.out.print("Enter password :  ");
        String passWord = sc.nextLine();
        boolean check = Pattern.matches("[A-Z]{1}[a-z]{5,}[0-9]{1}[!@#$%^&*~]{1}", passWord);
        if (check)
            System.out.println("Perfect! #password");
        else
            System.out.println("Please Enter a Valid password, it should have minimum 8 characters with, 1 upper case, 1 Numeric and 1 Special Char ");
    }
    // This is code for which satisfies for all emails given to check
    public void emailUniversal(String eMail){
        boolean check = Pattern.matches("[a-zA-Z0-9_.]*[-]*[+]*[0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", eMail);
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
		user.validMobileNum();
		user.checkPassWordRule1();
		user.checkPassWordRule2();
		user.checkPassWordRule3();
		user.checkPassWordRule4();
		
		 // This is code for which satisfies for all emails given to check
        user.emailUniversal("abc@yahoo.com");
        user.emailUniversal("abc-100@yahoo.com");
        user.emailUniversal("abc.100@yahoo.com");
        user.emailUniversal("abc111@abc.com");
        user.emailUniversal("abc-100@abc.net");
        user.emailUniversal("abc.100@abc.com.au");
        user.emailUniversal("abc@1.com");
        user.emailUniversal("abc@gmail.com.com");
        user.emailUniversal("abc+100@gmail.com.com");

	}
}

