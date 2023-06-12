import java.util.Arrays;

public class missing_number_array
{
    public static void main(String[] args)
    {
    int arr[]={1,2,5,6,4,8,7};
    int sum=0;
    int n=arr.length;
    //time_complexity of sum of nn is O(1)
     int sum_Natural=((n+1)*(n+2))/2;
     //time_complexity of sum of current elements O(n)
for (int i=0;i<n;i++)
{
    sum+=arr[i];

}
int missing_number=sum_Natural-sum;
        System.out.println("the missing number in the array is:"+missing_number);
        // answer is 3
   }
}
