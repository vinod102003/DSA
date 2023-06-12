import java.util.Arrays;

public class selection_sort
{

    public static void selectionSort(int arr[])
    {
    for(int i=0 ; i<arr.length - 1;i++)
    {
        int smallest = i;
        for(int j=i+1 ; j<arr.length ; j++)
        {
            if(arr[j] < arr[smallest])
            {
                smallest = j;
            }
        }
        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;

    }

    }

    public static void main(String[] args)
     {

        int arr[] = {50,25,38,44,99,16,11,21};

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

     }




}
