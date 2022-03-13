package polymorphism;

public class overloadpolymorphism {  // methods with same name in a class
	
	void sum() {

		System.out.println("sum method called");

	}
	
	void sum(int a, int b) {

		int sum=a+b;
		System.out.println("print int sum"+sum);

	}
	
	void sum(String a, String b) {
		
		String sum=a+b;

		System.out.println("print string sum"+sum);

	}

}
