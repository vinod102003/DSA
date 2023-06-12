public class multiplication_numREc
{
    public  static int productFind(int arr[] , int n)
    {
        // base case
        if(n <= 0)
        {
            return 1;
        }
        else
        {
            // recursive call for even indices
            return arr[n - 1] * productFind(arr, n - 2);

        }


    }


    public static void main(String[] args) {

        int arr [] = {2,3,2,5,4};

        int n = arr.length;


        int result = productFind(arr , n);


        int product = 16;

        if(product == result)
        {
            System.out.println("the product of some subset of a array is same");
        }else
        {
            System.out.println("the product of some subset of a array is not  same");
        }


    }


}
