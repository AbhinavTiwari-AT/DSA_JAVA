public class PairsOfArray {
    
    public static void getPairs(int arr[])
    {
        int totalpairs = 0;

       for(int i=0 ; i < arr.length ; i++)
       {
         int curr = arr[i];


         for(int j = i+1 ; j < arr.length ; j++)
         {
            System.out.print("(" + curr + "," + arr[j]+ ")");
            totalpairs++;

         }
         System.out.println();
       }
       System.out.println("the total no of pairs are : " +totalpairs);
    }

    public static void main(String[] args) {

        int arr[] = {2,4,6,8,10};

        getPairs(arr);
    }

}
