public class SlidingWindowBruteForce {
    public static void main(String[] args) {

        int k = 3;
        int[] arr = {2, 4, 7, 9, 12, 15, 11, 25};

        int n = arr.length;

        int[] arr1 = new int[n - k + 1];

        for(int i=0 ; i<n-k+1 ; i++)
        {
            int max = arr[i];
            for(int j=0 ; j < i+k ; j++)
            {
                if(arr[j] > max)
                {
                    max = arr[j];
                }
            }
            arr1[i] = max;
        }

        for(int i=0 ; i<arr1.length ; i++)
        {
            System.out.println(arr1[i]);
        }

    }
}

