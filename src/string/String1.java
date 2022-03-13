package string;

public class String1 {
	

	public static void main(String args[]) {
	String str1="hello"; // string literal
	String str2= new String("stringobject");  // object of string
	
	char[] arr=str1.toCharArray();
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
	int length=str1.length();
	System.out.println("string length"+length);
	
	//converting char array to string  
	char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
	String s=new String(ch); 
	System.out.println("string char array: "+s);
	
	
	
	}
	
}
