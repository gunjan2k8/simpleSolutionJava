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
	    
	    
	    // Traversing through Map using for-each loop
        for (Entry<Integer, String> me : map.entrySet()) {

            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
        
	}

}
