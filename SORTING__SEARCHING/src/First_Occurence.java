import java.util.Scanner;
// sc = O(1)
// tc = O(logN)

public class First_Occurence
{
public static int firstOccurrence(int arr[], int target)
{
    int low = 0 , high = arr.length-1;
    int result = -1;

    while(low<=high)
    {
        int mid = low +(high-low)/2;

        if(arr[mid]==target)
        {
                result = mid;
            // we need to find the first occurrence so we iterate our array towards left
            high = mid -1;
         //   low = mid + 1; for the last occurrence
        }else if(arr[mid]<target)
        {
            low = mid +1;
        }else
        {
            high = mid-1;
        }
    }
return result;
}
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in array");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array in the sorted manner");
        int arr[] = new int[n];

        for(int i = 0 ; i< n ;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be found");
        int target = sc.nextInt();

        int result = firstOccurrence(arr,target);

        if(result==-1)
        {
            System.out.println("the element is not found");
        }else
        {
            System.out.println("the first occurrence of the element is at this location : "+result);
        }


    }

}


