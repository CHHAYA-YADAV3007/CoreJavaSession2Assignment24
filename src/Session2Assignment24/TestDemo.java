package Session2Assignment24;

import java.util.Scanner ;


public class TestDemo
{

	public static void main(String[] args) 
	{
	    int input ;
	    
	    char ascii_value ;
	    
// Scanner class declaration to take input number from user
	    
		Scanner nr = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
// Take input from user
		
		 input = nr.nextInt();

		 
// Explicit type casting of user input into  its corresponding ascii value
		 
		 ascii_value = (char) input;
		 
		 if (input == 0)
			 
		 {
		
			 System.out.println("You Have Entered Zero");
	
		     
		 }
		 
		 else if (input > 0)
			 
		 {
		
			 System.out.println("You Have Entered Positive Value");
		     
		 }
		 
		 else if (input  < 0)
			 
		 {
		
			 System.out.println("You Have Entered Negative Value");
		 
		     
		     
		 }
		 
		 System.out.println("Its Ascii value is : "+ ascii_value);
		 
		 
		 
		 
// Closure of Scanner class object	
		 
		nr.close();

	}

}





















