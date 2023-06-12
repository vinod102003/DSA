import java.util.HashMap;
import java.util.Scanner;

public class twoSumProblem
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        int n = sc.nextInt();


        System.out.println("Enter the array elements");

        int arr[] = new int[n];

        for(int i=0 ; i<n ; i++)
        {
             arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target value");
        int target = sc.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i<arr.length;i++)
        {
            map.put(arr[i],i);
        }

        int result[] = new int[2];


        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i] == target && map.containsKey(0))
            {
                result[0] = i;
                result[1] = map.get(0);
            }else
            {
                if(map.containsKey(target - arr[i]))
                {
                    result[0] = i;
                    result[1] = map.get(target - arr[i]);
                }
            }
        }


        System.out.println("the resultant array is :["+result[0]+","+result[1]+"]");

    }
}
