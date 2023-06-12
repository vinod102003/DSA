public class duplicate_array
{
    public static void main(String[] args)
    {
    int arr[]={1,2,2,3,4,4,6,7};
    int n = arr.length;
    // time complexity is O(n^2)
    // space complexity is O(1)

    for (int i=0;i<n;i++)
    {
      for (int j=i+1;j<n;j++)
      {
          if (arr[i]==arr[j])
          {
              System.out.println("Duplicate elements are :"+arr[i]+" they are present at :"+i);
          }
      }
    }

    }
}
