package Inheritance;

public class MainClass {
	
	public static void main(String args[]) {
		
		
		Parent parent= new Parent();
		parent.name="mother";
		parent.eat();
		parent.walk();
		
		
		//parent.play();// will throw error because play method not in Parent class
	
		
	Child child= new Child(); // due to inheritance it can can access all methods of animal
	child.name="tommy";
	child.eat();
	child.walk();
	child.play();
	
	
	
		Parent child1= new Child();
		child1.name="animal dog";
		child1.eat();
		//child1.play();// will throw error because play method not in Parent class
		child1.walk(); // child class walk will be executed
		
    //Child child2= new Parent(); // not possible because a parent cannot be of child type
		
	}

}
