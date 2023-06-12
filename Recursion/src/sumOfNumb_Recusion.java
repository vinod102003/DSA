public class sumOfNumb_Recusion
{
    public static int sum(int[] arr, int n)
    {
        // Base case: if array size is 0, return 0
        if (n == 0)
        {
            return 0;
        }

        // Recursive case: add current element to sum of rest of the elements
        return arr[n-1] + sum(arr, n-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;
        int sum = sum(arr, n);
        System.out.println("Sum of the array elements: " + sum);
    }
}
