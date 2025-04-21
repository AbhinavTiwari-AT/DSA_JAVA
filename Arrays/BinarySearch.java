public class BinarySearch {

    public static int getBinary(int arr[], int key)
    {
        int start = 0;
        int end = arr.length-1;

        while(start <= end)
        {
            int mid = (start + end)/2;

            if(arr[mid] == key) 
            {
                return mid;
            }
            if(arr[mid] < key)
            {
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
     
        int arr[] = {2,4,5,8,11,14,16};
        int key = 11;

        int index = getBinary(arr, key);

        System.out.println("the index of key is : " +index);

    }
    
}
 