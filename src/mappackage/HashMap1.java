package mappackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {
	
	// order not maintained
	public static void main(String[] args) {  
		
	    Map<Integer,String> map=new HashMap<Integer,String>();  
	    map.put(1,"apple");  
	    map.put(5,"banana");  
	    map.put(2,"peach");  
	    map.put(6,"mango"); 
	    map.put(null, null);
	    map.put(null, null);
	    map.put(null, "mango");
	    
	    
	    // Traversing through Map using for-each loop
        for (Entry<Integer, String> me : map.entrySet()) {

            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
        
    	
	    Map<String,String> map1=new HashMap<String,String>();  
	    map1.put("user1","password1");  
	    map1.put("user2","password2");  
	    map1.put("user3","password3");  
	    map1.put("user4","password4");  
	 
	    
	    // Traversing through Map using for-each loop
        for (Entry<String, String> me : map1.entrySet()) {

            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
        
        
	}

}
