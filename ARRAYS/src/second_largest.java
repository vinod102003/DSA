import java.util.Scanner;

public class second_largest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array");
        int n=sc.nextInt();

        System.out.println("Enter the  elements of the array");
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        int secondMax=arr[0];
        int max=arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }

        System.out.println("The second highest element is: " + secondMax);
    }


}
