package finalpackage;

//https://www.javatpoint.com/final-keyword
class FinalMethodDec {
	
	 final void test2(){System.out.println("running");}  
	
	

}

public class FinalMethod extends FinalMethodDec {
	
 void test2(){System.out.println("running");}  
	
	 public static void main(String args[]){  
		 FinalMethod obj=new  FinalMethod();  
	 obj.test2(); 

	 }  

}
