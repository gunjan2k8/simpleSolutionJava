package setpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
	
	
	// // Elements get stored in default natural
    // Sorting Order(Ascending)
	public static void main(String args[]){  
		  
		    Set<String> set=new TreeSet<String>();  
		           set.add("One");    
		           set.add("Two");    
		           set.add("Three");   
		           set.add("Four");  
		           set.add("Five"); 
		           set.add("One");  
		           
		           System.out.println(set); 
		           
		           Iterator<String> i=set.iterator();  
		           while(i.hasNext())  
		           {  
		           System.out.println(i.next());  
		           }  
		           
		           
		           
		 		  for(String str: set) {
		 			   System.out.println("through for enchanced loop : "+str); 
		 			  
		 		  }
		 }  

}
