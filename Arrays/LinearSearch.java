package Arrays;

import java.util.Iterator;

public class LinearSearch {
	
	public static int linear(int array[] , int key) {
		
		for(int i=1; i <= array.length; i++)
		{
			if (array[i] == key) {
				
				return i;
			}
		}
		return -1;
	}
	
	
	
	public static void main(String agr[])
	{
		int array[] = {2,4,6,8,10,12,14,16};
    	int key =  10;
    	
    	int index = linear(array,key);
//		
    	System.out.println("the index of key is :- " +index);
    	
//		for(int i= 1 ; i <= array.length; i++)
//		{
//			if (array[i] == key) {
//				System.out.println("The index of key is :-" +i);
//			}
//		}
	}

}
