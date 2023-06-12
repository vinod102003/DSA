import java.util.Scanner;

public class d2_prefixsum_optimized
{
 // sum region takes constant time complexity
    public static int sumRegion(int [][]arr,int r1,int c1,int r2,int c2) // r1=2;c1=2;r2=3;c2=3
    {
        int sum=0,up=0,left=0,repeated_region=0;
    sum=arr[r2][c2];
    left=arr[r2][c1-1];
    up=arr[r1-1][c2];
    repeated_region=arr[r1-1][c1-1];

    int result = sum-up-left+repeated_region;
//
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=0;j<arr[0].length;j++)
//            {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println(" ");
      //  }
    return result;

    }

    // tc is O(m*n)
    public static void prefixSumMatrix(int arr[][])
    {
        int m = arr.length;
        int n =arr[0].length;

    // traverse the array row wise to calculate the row wise prefix sum
        for(int i=0;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                arr[i][j]+=arr[i][j-1];
            }

        }
        // traverse the array in column wise to calculate the column wise prefix sum
        for(int j=0;j<n;j++)
        {
            for(int i=1;i<m;i++)
            {
                arr[i][j]+=arr[i-1][j];
            }
        }

    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m =sc.nextInt();
        System.out.println("Enter the number of columns");
        int n =sc.nextInt();

        int arr[][]= new int[m][n];

        System.out.println("Enter the matrix elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        int r1,c1,r2,c2;
        System.out.println("Enter the value of r1 coordinate");
        r1=sc.nextInt();

        System.out.println("Enter the value of c1 coordinate");
        c1=sc.nextInt();

        System.out.println("Enter the value of r2 coordinate");
        r2=sc.nextInt();

        System.out.println("Enter the value of c2 coordinate");
        c2=sc.nextInt();

        prefixSumMatrix(arr);

        int result =sumRegion(arr,r1,c1,r2,c2);
        System.out.println("Sum of elements of given rectangle is:"+result);



    }
}
