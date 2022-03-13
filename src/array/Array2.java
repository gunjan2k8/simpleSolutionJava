package array;

public class Array2 {
	
	public static void main (String[] args)
    {
        // declares an Array of integers.
        User[] arr;
 
        // allocating memory for 5 objects of type User.
        arr = new User[5];
        
        arr[0] = new User("name1",12);
        arr[1] = new User("name2",13);
        arr[2] = new User("name3",14);
        arr[3] = new User("name4",15);
        arr[4] = new User("name5",16);
        
        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : " + arr[i].name +" "+ arr[i].age);
        
      
        
    }

}
