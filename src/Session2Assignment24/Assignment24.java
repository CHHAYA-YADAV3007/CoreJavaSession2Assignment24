package Session2Assignment24;

import java.util.Scanner;

public class Assignment24 
{
	
	public static void main(String[] args) 
	{
	    float p_marks = 0 ;
	    
	    float c_marks = 0 ;
	    
	    float m_marks = 0 ;
	    
	    float average = 0 ; 
	    
	    char grade ;
	   
	    
// Scanner class declaration to take input number from user
	    
		Scanner nr = new Scanner(System.in);
		
		System.out.println("Enter the physics marks ");
		
// Take input from user
		
		 p_marks = nr.nextInt();
		 
		 System.out.println("Enter the chemistry marks ");
			
// Take input from user
				
		 c_marks = nr.nextInt();
				 
		 System.out.println("Enter the maths marks ");
					
// Take input from user
						
		 m_marks = nr.nextInt();

// calculate the average for student grades
		 
         average = (float) ((p_marks + c_marks + m_marks )/3);
		 
// determine the student grade based on the average
         
		 if (average > 70 & average <=100 )
			 
		 {
			  grade = 'A' ;
		 }

		 else if (average >= 61 & average <= 70)
			 
		 {		
			 grade = 'B' ;     
		 }
		 
		 else 
			 
		 {
			 grade = 'C' ;
		 }
		
// display the grade of student based on the above logic
		 
	     System.out.println(" Student Grade : " + grade );
		 
		     		 
// Closure of Scanner class object	
		 
		nr.close();
	}

}
	
