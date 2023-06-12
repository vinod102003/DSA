import java.util.Scanner;
public class Linear_search
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

        System.out.println("enter the target value that you want to search");
        int target=sc.nextInt();

        // implementation of linear search
        int idx =-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target)
            {
                idx=i;
                System.out.println("Element is present at the location:"+idx);
                break;
            }
        }
if(idx==-1)
{
    System.out.println("target element  is not found");
}




}}
