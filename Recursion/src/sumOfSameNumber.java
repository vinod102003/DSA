public class sumOfSameNumber
{
    public static int sum(int num)
    {
        if(num == 0)
        {
            return 0;
        }else
        {
            return num % 10 + sum(num / 10);
        }
    }

    public static void main(String[] args)
    {
             int num = 3456;

              int result = sum(num);

        System.out.println(result);
    }
}
