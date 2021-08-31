//package week3.lab.assignment;

import java.util.Random;

public class CredentialService {

	//_______ Class Variables _______//
	private String fName="Soham";
	private String lName="Chakraborty";
	private String emailAddress;
	private String password;
	private int passwordLength=8;
	
	//======= Method to generate Email Address =======//
	void generateEmailAddress(String department) {
		
		//_______ Employee Object _______//
		Employee obj = new Employee(this.fName, this.lName);
		
		String firstName = obj.getFirstName();
		String lastName = obj.getLastName();
		
		this.emailAddress = firstName+lastName+"@"+department+".companyname.com";
	}
	
	//======= Generate Password =======//
	void generatePassword() {
		
		//_______ String Characters that the password might contain _______//
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
		//_______ Random Object _______//
		Random rnd = new Random();
		//_______ String Builder Object _______//
		StringBuilder sb = new StringBuilder(this.passwordLength);
		
		//_______ Loop to generate password character by character from the list of characters we have _______//
		for (int i = 0; i < this.passwordLength; i++)
			//_______ Append the random acquired character _______//
			sb.append(characters.charAt(rnd.nextInt(characters.length())));
		this.password = sb.toString();
	}
	
	//======= Function to display the generated Credentials =======//
	void showCredentials() {
		System.out.printf("Dear %s your generated credentials are as follows\n",this.fName);
		System.out.printf("Email -------> %s\n",this.emailAddress);
		System.out.printf("Password -------> %s\n",this.password);
	}
	
}
