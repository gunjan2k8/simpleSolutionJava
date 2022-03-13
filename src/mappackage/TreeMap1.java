package mappackage;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMap1 {
	
	// key in ordered
	public static void main(String[] args) {  
	    Map<Integer,String> map=new TreeMap<Integer,String>();  
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
