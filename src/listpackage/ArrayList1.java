package listpackage;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	
	public static void main(String args[]){  
		
		// order is maintained
		  List<String> list=new ArrayList<String>();
		  list.add("gunjan"); 
		  list.add("test1");    
		  list.add("test2");    
		  list.add("object1"); 
		  list.add("gunjan");
		  list.add(null);
		  list.add(null);
		  
			
		  List<Integer> list1=new ArrayList<Integer>();
		  list1.add(1); 
		  list1.add(2);    
		  list1.add(3);    
		  list1.add(4);
		  
		  //Traversing list through Iterator  
		  Iterator itr=list.iterator();//getting the Iterator  
		  while(itr.hasNext()){//check if iterator has the elements  
		   System.out.println("through iterator : "+itr.next());//printing the element and move to next  
		  }  
		  
		  
		  Iterator itr1=list.listIterator();//getting the Iterator  
		  while(itr1.hasNext()){//check if iterator has the elements  
			   System.out.println("through list iterator :"+itr1.next());//printing the element and move to next  
		  }  
		  
		  
		  // for enchanced loop
		  for(String str: list) {
			   System.out.println("through for enchanced loop :"+str);//printing the element and move to next  
			  
		  }
		  
		//Traversing list through Iterator  
		  Iterator itr2=list1.iterator();//getting the Iterator  
		  while(itr2.hasNext()){//check if iterator has the elements  
		   System.out.println("through iterator : "+itr2.next());//printing the element and move to next  
		  }  
		  
		  
		  Iterator itr3=list1.listIterator();//getting the Iterator  
		  while(itr3.hasNext()){//check if iterator has the elements  
			   System.out.println("through list iterator :"+itr3.next());//printing the element and move to next  
		  }  
		  
		  
		  // for enchanced loop
		  for(Integer str: list1) {
			   System.out.println("through for enchanced loop :"+str);//printing the element and move to next  
			  
		  }
		  
	}


	
	
}
