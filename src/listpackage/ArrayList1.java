package listpackage;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	
	public static void main(String args[]){  
		
		  List<String> list=new ArrayList<String>();
		  list.add("gunjan"); 
		  list.add("test1");    
		  list.add("test2");    
		  list.add("object1");    
		  //Traversing list through Iterator  
		  Iterator itr=list.iterator();//getting the Iterator  
		  while(itr.hasNext()){//check if iterator has the elements  
		   System.out.println("through iterator : "+itr.next());//printing the element and move to next  
		  }  
		  
		  
		  Iterator itr1=list.listIterator();//getting the Iterator  
		  while(itr1.hasNext()){//check if iterator has the elements  
			   System.out.println("through list iterator :"+itr1.next());//printing the element and move to next  
		  }  
		  
		  
		  
		  for(String str: list) {
			   System.out.println("through for enchanced loop :"+str);//printing the element and move to next  
			  
		  }
		  
	}


	
	
}
