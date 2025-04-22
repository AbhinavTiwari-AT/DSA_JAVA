public class SubAarrys {

    public static void getSubArrays(int arr[])
    {
        int totalpairs = 0;

        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = i ; j < arr.length; j++)
            {
                for(int k = i; k <= j; k++)
                {
                    System.out.print(arr[k]+ " ");
                }
                totalpairs++;
                System.err.println("");
            }
            System.err.println("");
        }
        System.err.println("the total no of pairs are : " + totalpairs);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        getSubArrays(arr);
    }
    
}
