package encapsulation;

public class MainClass {
	
	public static void main(String args[]) {
		
		
		Encap1 en= new Encap1();
		
		en.setAge(12);
		en.setName("name");
		
		System.out.println("age: " + en.getAge());
		System.out.println("name: " + en.getName());
		
		// Direct access of name and age is not possible due to encapsulation
		//System.out.println("age: " + en.age);
		//System.out.println("name: " + en.name);

	
		
	}

}
