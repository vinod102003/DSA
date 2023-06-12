import java.util.Scanner;
// the series is {1,-2,3,-4,5}
// sum 1-2+3-4+5 = 3
// even index is -ve $ odd index is +ve

// for even num-1 - num
// for odd num-1 + num
public class alternateSum
{
    public static int alternateSignSum(int num)
    {
        if( num==0)
        {
            return 0;
        }
        else if(num % 2 ==0)
            {
              return   alternateSignSum(num-1) -num;
            }
        else
            {
             return    alternateSignSum(num-1) +num;
            }
        }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

           int   result =  alternateSignSum(num);
        System.out.println(" the alternate sum series is:"+result);


    }


}
