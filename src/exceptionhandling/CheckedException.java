package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
	
	
	// checked exception // compile time exception using throw

    public static void agecheck(int age) throws FileNotFoundException {  
  
        if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible to do voting");    
        }  
        else {  
            System.out.println("Person is eligible to do voting!!");  
        }  
      
    }  
    //main method  
    public static void main(String args[]){  
        try  
        {  
        	agecheck(13);  
        }   
        catch (FileNotFoundException e)   
        {  
            e.printStackTrace();  
            System.out.println("catch block executed");   
        }  
       
  }    
}
