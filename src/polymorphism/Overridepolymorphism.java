package polymorphism;


class BaseClass {    // method signature and return should be same
	
	 void sum() {

		System.out.println("BaseClass sum method called");

	}
	
	void add() {

		System.out.println("BaseClass add method called");

	}
	
	 int sum(int a , int b) {
		 int c=a+b;

			System.out.println("BaseClass sum method called");
			return c;

		}


}
public class Overridepolymorphism extends BaseClass {
	
	void sum() {

		System.out.println("overridepolymorphism sum method called");

	}
	
	void divide() {

		System.out.println("overridepolymorphism divide method called");

	}
	
	int sum(int a , int b) {
		
		int c=a-b;
		return c;
		
	}

	
	
	
public static void main(String args[]) {
		
	Overridepolymorphism obj1= new Overridepolymorphism();
		obj1.sum(); //overridepolymorphism sum method called
		obj1.divide();
		

		BaseClass bc= new BaseClass();
		bc.sum(); //BaseClass sum method called
		
		
		BaseClass bc1= new Overridepolymorphism();
		bc1.sum(); //overridepolymorphism sum method called
		bc1.add(); //BaseClass add method called
		//bc1.divide();// throw an error as method not in BaseClass 
		

	}
	
	

}