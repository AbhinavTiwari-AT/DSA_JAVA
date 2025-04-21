public class Largest {
    public static int getLargest(int arr[])
    {
        int Largest = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length ; i++)
        {
            if(arr[i] > Largest)
            {
                Largest = arr[i];
            }
        }
      return Largest;
    }
    public static void main(String args[])
    {
        int arr[] = {4,6,5,7,2,1,3};

        int value = getLargest(arr);

        System.out.println("largest value is : " + value);

    }
}
