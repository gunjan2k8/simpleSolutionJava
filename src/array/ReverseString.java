package array;

public class ReverseString {
	
	
	public static void main (String[] args)
    {
        String str="hello";
        char[] arr= str.toCharArray();
       
        
       String reverseString="";
        // accessing the elements of the specified array
        for (int i=arr.length-1;i>=0 ;i--)
        {
        	reverseString=reverseString+arr[i];
      
        }
   
    System.out.println("reversed string is " + reverseString);
}
	

}
