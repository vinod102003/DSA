import java.util.Scanner;


public class d2_prefix_sum_notOPtimized {

 public static int findSumMatrix(int[][] arr,int r1,int c1,int r2,int c2)
 {
     int sum =0;
for(int i=r1;i<=r2;i++)
{
    for(int j=c1;j<=c2;j++)
    {
       // sum+=arr[i][j];
        sum=sum+arr[i][j];
    }
}
     return sum;
 }
    public static void main(String[] args) {
//        //prefix sum for 1d array
//        int a[]={2,4,5,7};
//       // int y[]= new int[a.length];
//        for (int i=1;i<a.length;i++)
//        {
//                a[i]=a[i]+a[i-1];
//        }
//        for(int i=0;i<a.length;i++)
//        {
//            System.out.println(a[i]);
//        }

//        // prefix sum for 2d array
//        int arr[][]={
//                        {1,1,1,1},
//                        {1,1,1,1},
//                        {1,1,1,1},
//                        {1,1,1,1}
//        };
//        //Sum of The Matrix
//        int sum =0;
//   for (int i=0;i<arr.length;i++){
//
//       for (int j=0;j<arr[i].length;j++)
//       {
//
//            sum += arr[i][j];
//       }
//   }
//        System.out.println("sum:"+sum);
//
//// When r1=2;c1=2;c2=3;r2=3;
//int sum1 =0;
//   for (int i=2;i<arr.length;i++){
//
//        for (int j=2;j<arr[i].length;j++)
//        {
//
//            sum1 += arr[i][j];
//        }
//    }
//        System.out.println("sum1:"+sum1);
//
//   // Whem r1=0;c2=2;r2=3;c2=3
//        int sum2 =0;
//        for (int i=0;i<arr.length;i++){
//
//            for (int j=2;j<arr[i].length;j++)
//            {
//
//                sum2+= arr[i][j];
//            }
//        }
//        System.out.println("sum2:"+sum2);
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

        int result =findSumMatrix(arr,r1,c1,r2,c2);
        System.out.println("Sum of elements of a given rectangle is:"+result);


}


}

