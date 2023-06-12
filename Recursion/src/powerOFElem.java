import java.util.Scanner;

public class powerOFElem
{
    public static long powerFind(int a ,int b)
    {
        long result = 0;
        long finalResult = 0;
        // base case if power is b=1 then return the number a because anything power 1 is the number like 2^1 = 2 , 99^1 = 99
        if (b == 1)
        {
            return a;
        }
        else
        {
            int mid = b / 2;

          //  result = powerFind(a, mid) * powerFind(a,mid);
            // the left and right side is so we wrote it once the recursive call to reduce the time complexity
            result = powerFind(a,mid);

            finalResult = result * result;



            if (b % 2 == 0)
            {
                // if the  given power is even than return answer directly
                return finalResult;
            } else
            {
                // if the given power is odd like 2^31 is   2 * 2^30
                return a * finalResult;


            }
        }



    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int a = sc.nextInt();

        System.out.println("Enter the power of the number");
        int b = sc.nextInt();


        long result = powerFind(a, b);

        System.out.println("the result is :" + result);

    }}
