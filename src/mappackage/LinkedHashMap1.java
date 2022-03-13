package mappackage;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMap1 {
	
	// order maintained
	public static void main(String[] args) {  
	    Map<Integer,String> map=new LinkedHashMap<Integer,String>();  
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
