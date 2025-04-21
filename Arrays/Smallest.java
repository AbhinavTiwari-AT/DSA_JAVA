public class Smallest {

    public static int getSmallest(int arr[])
    {
        int small = Integer.MAX_VALUE;
        for(int i = 0; i< arr.length; i++)
        {
            if(small > arr[i])
            {
                small = arr[i];
            }
        
        }
        return  small;
    }
    
    public static void main(String args[])
    {
        int arr[] = {32,4,13,1,3,44};

        System.out.println("the smallest is : "+getSmallest(arr));
    }
}

