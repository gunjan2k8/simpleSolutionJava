package staticpackage;

public class MainClass {
	
	public static void test1() {
		
		  System.out.println("test1"); 
	}
	
	public static void main(String args[]) {
		
		int value=StaticClass1.a;
		System.out.println("value of a "+value);
		StaticClass1.test();
		test1();
		
	}

}
