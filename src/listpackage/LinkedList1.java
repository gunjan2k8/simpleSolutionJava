package listpackage;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
	
	
	public static void main(String args[]){  
		
		  List<String> list=new LinkedList<String>();//Creating linkedlist  
		  list.add("gunjan");//Adding object in linkedlist    
		  list.add("test1");    
		  list.add("test2");    
		  list.add("object1");    
		  //Traversing list through Iterator  
		  Iterator itr=list.iterator();//getting the Iterator  
		  while(itr.hasNext()){//check if iterator has the elements  
		   System.out.println(itr.next());//printing the element and move to next  
		  }  
		  
	}


	

}
