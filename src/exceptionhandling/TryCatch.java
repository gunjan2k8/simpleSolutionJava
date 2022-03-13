package exceptionhandling;

public class TryCatch {
	
	// unchecked exception // runtime exception
	public static void main(String[] args) {  
        try  
        {  
        int data=50/0; //throw exception   
        }  
            //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);
            System.out.println("catch block executed");
        }  
         
    }  

}
