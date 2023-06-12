public class inversionBruteForce
{
    public static void main(String[] args)
    {

        int arr[] = {70,50,60,10,20,30,80,15};

            int count = 0;
            int n = arr.length;
            for(int i=0 ; i < n; i++)
            {
                for(int j = i+1 ; j < n ; j++)
                {
                    if(arr[i] > arr[j])
                    {
                        count++;
                    }
                }
            }

        System.out.println(count);
    }
}
