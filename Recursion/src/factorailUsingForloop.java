import java.util.Scanner;

public class factorailUsingForloop
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorialUsingRecursion is to be found");
        int n = sc.nextInt();

        int sum=1;


        for(int i =1 ; i<n; i++)
        {

            sum = sum * (i+1);

        }

        System.out.println(sum);

    }
}
