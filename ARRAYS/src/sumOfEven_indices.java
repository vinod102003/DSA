import java.util.Scanner;

public class sumOfEven_indices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array");
        int n = sc.nextInt();

        System.out.println("Enter the  elements of the array");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        int sum = 0;
        for (int i = 0; i < n; i = i + 2) {
            sum += arr[i];
        }
        System.out.println(" the sum of even indices in given array : " + sum);


    }
}