package datatypes;

public class WrapperClass {
	
	//https://www.javatpoint.com/wrapper-class-in-java
	// after java 5 no need to do autoboxing and unboxing
	
	public static void main(String args[]){  
		
		//Converting int into Integer  
		int a=20;  
		Integer b=Integer.valueOf(a);//converting int into Integer explicitly 
		//or
		Integer c=b; //autoboxing, now compiler will write Integer.valueOf(a) internally  
		System.out.println(a+" "+b+" "+c);  
		
		
		
		//Converting Integer to int    
		Integer d = 3;   
		
		int e=d.intValue();//converting Integer to int explicitly  
		//or
		int f=d;//unboxing, now compiler will write a.intValue() internally    
		System.out.println(d+" "+e+" "+f);    
		}

}
