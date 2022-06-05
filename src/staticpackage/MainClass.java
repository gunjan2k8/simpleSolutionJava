package staticpackage;

public class MainClass {
	
	public static void test1() {
		
		  System.out.println("test1"); 
		  StaticClass1.a=5;
	}
	
	public  void test2() {
		
		  System.out.println("test2"); 
	}
	
	
	public static void main(String args[]) {
		
		int value=StaticClass1.a;
		System.out.println("value of a "+value);  // 2
		StaticClass1.test();
		test1();
		int value1=StaticClass1.a;
		System.out.println("value of a "+value1);
		
		
	}

}
