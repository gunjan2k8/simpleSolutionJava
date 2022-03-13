package interfaces;


public class Bmw implements Car{

	
	public void acceleartion() {

		System.out.println("accelaeartion method called of BMW");
		
	}
	
	public static void main(String args[]) {
		
		Car carobj= new Bmw();
		carobj.acceleartion();
		System.out.println(carobj.a);
		
		Bmw carobj1= new Bmw();
		carobj1.acceleartion();


	}


}
