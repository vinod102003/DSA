import java.util.Scanner;

public class higest_element
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array");
        int n=sc.nextInt();

        System.out.println("Enter the  elements of the array");
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }

        int max = arr[0];

        for(int i =0 ; i<n ; i++)
        {
            if(max < arr[i])
            {
                max=arr[i];
            }
        }

        System.out.println(" the maximum element in the array is :"+max);
    }






    }





