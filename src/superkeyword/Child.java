package superkeyword;

class Parent{
	
public Parent(){
System.out.println("inside parent"); 

}

public Parent(int a){
System.out.println("inside parametrised parent"); 

System.out.println("value of a"+ a); 

}
public static void main(String args[]){
}
}
public class Child extends Parent{
public Child(){
//super();  // call parent class constructor always class automatically whether we use here super() or not.
super(2); // now parametrised constructor will be called
System.out.println("inside child"); 

}

public static void main(String args[]){
Child child = new Child();

}}



