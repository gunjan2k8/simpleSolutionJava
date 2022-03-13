package array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {
	
		public static void main(String[] args)
		{
			
			List<String> myitem = new ArrayList<>();
			myitem.add("pen");
			myitem.add("pencil");
	
			Collections.addAll(myitem, "sharpener", "ball", "rubber");
		
			Collections.sort(myitem);

			for (int i = 0; i < myitem.size(); i++) {
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
