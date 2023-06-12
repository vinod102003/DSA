import java.util.Scanner;
// the person can move 1 or 2 steps at once
public class countStairs
{
    public static int findStairs(int n)
    {
        int result = 0;

        if(n <= 2)
       {
           return n;
       }
        else
       {
            result = findStairs(n-1) + findStairs(n-2);
       }

            return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the number of stairs");
        int n = sc.nextInt();

        int result = findStairs(n);
        System.out.println("the number of the ways are :"+result);

    }
}
