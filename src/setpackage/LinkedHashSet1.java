package setpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {
	
	// order maintained and store unique elements
	public static void main(String args[]){  
		  
		    Set<String> set=new LinkedHashSet<String>();  
		           set.add("One");    
		           set.add("Two");    
		           set.add("Three");   
		           set.add("Four");  
		           set.add("Five"); 
		           set.add("One");  
		           
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


