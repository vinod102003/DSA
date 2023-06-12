import java.util.Scanner;

public class powerElementNotopti
{
    public static long powerFind(int a ,int b)
    {
        // base case if power is b=1 then return the number a because anything power 1 is the number like 2^1 = 2 , 99^1 = 99
        if(b == 1)
        {
            return a;
        }
        else
        {
            // recursive call 2^3 = 2*2^2 / 2^2 = 2* 2^1

            return  a * powerFind(a,b-1);

        }


    }
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int a = sc.nextInt();

        System.out.println("Enter the power of the number");
            int b = sc.nextInt();



        long result = powerFind(a,b);

        System.out.println("the result is :"+result);









    }
}
