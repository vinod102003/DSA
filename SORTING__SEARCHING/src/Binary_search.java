import java.util.Scanner;
// sc = O(1)
// tc = O(logN)
public class Binary_search
{
    public static int binarySearch(int arr[] , int target)
    {
        int low=0;
        int high=arr.length-1;

        while(low<=high)
        {
            int mid= low + (high - low)/2;
            if(arr[mid]==target)
            {
                return mid;
            }else if(arr[mid] < target)
            {
                low = mid+1;
            }else
            {
                high = mid -1;
            }
        }
        return 0;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array in the sorted manner");
        int arr[] = new int[n];

        for(int i=0; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be found");
        int target = sc.nextInt();

        int result= binarySearch(arr , target);

        if(result==0)
        {
            System.out.println("Element is not found in array");

        }else
        {
            System.out.println("Element is present at index location :"+result);
        }

    }

}


















