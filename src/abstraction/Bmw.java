package abstraction;



public class Bmw extends Car{


 void break1() {

		System.out.println("break method called");

	}

	public static void main(String args[]) {
		
		Car carobj= new Bmw();
		carobj.break1();
		
		Car carobj1= new Bmw();
		carobj1.break2();
		
		Bmw carobj2= new Bmw();
		carobj2.break1();


	}



}
