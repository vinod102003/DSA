import java.util.Arrays;

public class bubble_sort
{
    public static void bubbleSort(int arr[])
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            boolean swapped = false;
            for(int j= 0 ; j<arr.length-1-i ; j++)
            {
                if(arr[j] > arr[j+1])

                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }




    }
    public static void main(String[] args)
    {
    int arr[] = {70,20,50,30,90,5,15};

    // function calling
    bubbleSort(arr);

        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(arr));

    }
}
