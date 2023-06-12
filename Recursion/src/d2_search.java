public class d2_search
{
    public static boolean searchMatrix(int matrix[][] , int target)
    {
        // number of rows
        int m = matrix.length;

        // base case
        if(m == 0)
        {
            return false;
        }

        // number of the columns
        int n = matrix[0].length;

            int low = 0 , high = m * n - 1;

            int midIdx , midElement , rowIdx , colIdx;

            while(low<=high)
            {
                    midIdx = low + (high - low)/2;

                   rowIdx = midIdx / n;
                   colIdx = midIdx % n;

                   midElement = matrix[rowIdx][colIdx];

                    // condition 1-match
                    if(midElement == target)
                    {
                        return true;
                    }
                    // condition 2
                    else if( target < midElement)
                    {
                        high = midIdx - 1;
                    }
                    // condition 3
                    else
                    {
                        low = midIdx +1;
                    }
            }

            return false;

    }



   public static void main(String[] args)
    {
        int arr[][] =
                {
                        {1,3,5,7},
                        {10,11,16,20},
                        {23,30,34,60}
                };
             boolean result  =  searchMatrix(arr,3);

    if(result != false)
    {
        System.out.println("the element is present at :"+result);
    }else
    {
        System.out.println("not found");
    }


    }
}
