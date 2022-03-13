package Inheritance;

public class MainClass {
	
	public static void main(String args[]) {
		
		
		Animal animal= new Animal();
		animal.name="animal";
		animal.eat();
		//animal.dogeat();// will throw error because dogeat method not in Animal class
		
		
		Dog dg= new Dog(); // due to inheritance it can can access all methods of animal
		dg.name="tommy";
		dg.eat();
		dg.dogeat();
		
		Animal anidog= new Dog();
		anidog.name="animal dog";
		anidog.eat();
		//anidog.dogeat();// will throw error because dogeat method not in Animal class
		
	//	Dog anidog= new Animal(); // not possible because a parent cannot be of child type
		
	}

}
