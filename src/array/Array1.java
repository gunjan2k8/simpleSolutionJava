package array;

public class Array1 {
	
	 public static void main (String[] args)
	    { 
	
	int[] x1;//declaration
	
	int[] x2= {1,2,3,4}; // array literal
	System.out.println(x2[0]);//1
	x2[0] = 10;
	System.out.println(x2[0]);//10
	
	int[] x = new int[]{1,2,3};
	int[] x3= new int[5];// // allocating memory to array
	x3[0]=45;
	x3[1]=56;
	x3[2]=78;
	x3[3]=34;
	x3[4]=89;

	System.out.println("lenght of array"+x3.length);
	
	
	for(int i = 0; i <x3.length; i++)
        System.out.println("Element at index " + i + " : "+ x3[i]);         
   }
	
	

}
