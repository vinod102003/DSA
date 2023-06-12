import java.util.Scanner;
// tc O(log n) sc O(1)
public class square_root
{
public static  int squareRoot(int num)
{
            int low = 0, high = num, result = -1;

            while(low<=high)
            {
                int mid = (low + high)/2;
                long value = mid * mid;
                if(value == num)
                {
                    return mid;
                }else if(value<num)
                {
                    result = mid;

                    low = mid+1;
                }else
                {
                    high = mid -1;
                }

            }
            return result;
}
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element whose square root is to be found:");
        int num = sc.nextInt();

        int result = squareRoot(num);
        System.out.println("the square root of a given number is :"+result);







    }
}
