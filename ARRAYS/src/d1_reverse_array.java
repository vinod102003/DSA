public class d1_reverse_array
{
    public static void main(String[] args)
        {
            int arr[] = {2,4,6,8,10};
            int n=5;
            for (int i=0;i<n/2;i++)
                {
                    //swapping between two elements
                    int temp=arr[i];
                    arr[i]=arr[n-1-i];
                    arr[n-1-i]=temp;
                }
            System.out.println("reversed array is:");
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }

    }


