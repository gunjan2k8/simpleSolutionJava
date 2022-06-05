package array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {
	
		public static void main(String[] args)
		{
			
			List<String> myitem = new ArrayList<>();
			myitem.add("pen2");
			myitem.add("pen");
			myitem.add("pencil");
			
	
			// it is adding three more objects in the ArrayList
			Collections.addAll(myitem, "sharpener", "ball", "rubber");
		
			Collections.sort(myitem);

			for (int i = 0; i < myitem.size(); i++) { // 0 to length of the ArrayList 0 to 5
				System.out.print(myitem.get(i) + " ");
			}

			System.out.println();

			// Sorting according to reverse ordering
			Collections.sort(myitem, Collections.reverseOrder());

			// Printing the reverse order
			for (int i = 0; i < myitem.size(); i++) {
				System.out.print(myitem.get(i) + " ");
			}
		}
	}
