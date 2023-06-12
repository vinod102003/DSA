import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class permutationNum
{
    static ArrayList<String> al = new ArrayList<>();

    public static int[] swap(int arr[] , int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }
    public static void permutation(int arr[] , int fi)
    {
        //base case
        if(fi == arr.length-1)
        {
            al.add(Arrays.toString(arr));
            return;
        }

        for(int i=fi ; i<=arr.length-1 ; i++)
        {
            arr = swap(arr , fi ,i);

            permutation(arr,fi+1);

            arr =swap(arr,fi,i);
        }


    }





    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array");
        int n = sc.nextInt();

        System.out.println("Enter the element of the array ");
        int arr[] = new int[n];

        for(int i=0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        permutation(arr , 0);

        System.out.println(al);
    }
}
