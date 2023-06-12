import java.util.Scanner;

// tc is O(2^n) exponential time complexity
// sc is O(n)
public class fibonacci_number
{
    public static int fibonaaciFind(int n)
    {
        int result =0;
        // base case condition
        if(n<=1)
        {
            return n;
        }
        else
        {
            // recursive call
             result = fibonaaciFind(n-1) + fibonaaciFind(n-2);

        }
    return result;
    }

    public static void main(String[] args)
    {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  nth  number in fibonacci series");
        int n = sc.nextInt();

        int result = fibonaaciFind(n);

        System.out.println("the result of nth fibonacci number is :"+result);


    }

}
