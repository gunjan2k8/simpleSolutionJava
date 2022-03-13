package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException2 {
	
	
	// checked exception // compile time exception using try catch only
 
    public static void main(String args[]){  
        try  
        {  
        	 FileReader file = new FileReader("C:\\Users\\Desktop\\abc.txt");  
             BufferedReader fileInput = new BufferedReader(file);  
        }   
        catch (FileNotFoundException e)   
        {  
            e.printStackTrace();  
            System.out.println("catch block executed");   
        }  
       
  }

}
