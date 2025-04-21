public class ReverseOfArray {

    public static int  getReverse(int arr[])
    {
       int first = 0 , last = arr.length-1;

       while(first < last)
       {
          int temp = arr[first];
          arr[first] = arr[last] ;
          arr[last] = temp;

          first ++;
          last --;
       }
       return -1;
    }

    public static void main(String[] args) {
        
        int arr[] = {2,4,5,8,9,10,13,4};

        getReverse(arr);

        for(int i = 0 ; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
