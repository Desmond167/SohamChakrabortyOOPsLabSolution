//package week3.lab.assignment;

import java.util.Scanner;

//======= The Driver Class =======//
public class Main {
	
	//======= Main Function =======//
	public static void main(String[] args) {
		
		System.out.println("Please enter the department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		
		//_______ Variable to store Integer choice of user _______//
		int choice = sc.nextInt();
		
		//_______ Variable to store respective department name _______//
		String department="";
		
		if (choice==1) {
			department="Technical";
		}
		else if (choice==2) {
			department="Admin";
		}
		else if (choice==3) {
			department="HumanResource";
		}
		else if (choice==4) {
			department="Legal";
		}
		else {
			System.out.println("Wrong Choice");
		}
		
		sc.close();
		
		//_______ Create the Credential Service Object _______//
		CredentialService obj = new CredentialService();
		
		//_______ Generate Email Address _______//
		obj.generateEmailAddress(department);
		
		//_______ Generate Password _______//
		obj.generatePassword();
		
		//_______ Display Credentials _______//
		obj.showCredentials();
		}

}
