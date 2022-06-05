package interfaces;


public class Bmw implements Car{

	
	int b=100;
	public void acceleartion() {

		System.out.println("accelaeartion method called of BMW");
		
	}
	
	public static void main(String args[]) {
		
		Car carobj= new Bmw();
		carobj.acceleartion();
		System.out.println(Car.a);
		
		Bmw carobj1= new Bmw();
		carobj1.acceleartion();
		int value=carobj1.b;
		System.out.println(value);
	

	}
	



}
