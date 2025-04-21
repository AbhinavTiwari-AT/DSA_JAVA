
public class LinearSearch
{
    public static int Linear(int arr[], int key)
    {
        for(int i = 0; i <= arr.length ; i++)
        {
            if(arr[i] == key)
            {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        
        int arr[] = {2,4,5,4,7,5,12};
        int Key = 4;
        
        int index = Linear(arr,Key);

        if(index == -1)
        {
            System.out.println("Not fount");
        }else
        {
          System.out.println("the index of key is : " + index);
        }

    }
}