package setpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {
	
	// insertion order not maintained , only store unique elements
	public static void main(String args[]){  
	
		    Set<String> set=new HashSet<String>();  
		           set.add("One");    
		           set.add("Two");    
		           set.add("Three");   
		           set.add("Four");  
		           set.add("Five");  
		           set.add("One");  
		           set.add(null);
		           set.add(null);
		           
		           Iterator<String> i=set.iterator();  
		           while(i.hasNext())  
		           {  
		           System.out.println(i.next());  
		           }  
		           
		           
		           
		 		  for(String str: set) {
		 			   System.out.println("through for enchanced loop :"+str); 
		 			  
		 		  }
		 }  
		}  


