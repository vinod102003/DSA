import java.util.Scanner;
// tc is O(n) linear time complexity

// sc is O(n) because of stack memory
public class factorialUsingRecursion
{
    public static int factorialFinding(int n)
    {

        int result = 0;
        // Base case condition
                if(n==1 || n==0)
                {
                    return  1;
                }
                else
                {
                    // Recursive call
                    result = n * factorialFinding(n-1);
                }
        return result;
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number whose factorial is to be found");
        int n = sc.nextInt();


        int result = factorialFinding(n);
        System.out.println("the factorial of the number is :"+result);

    }

}
