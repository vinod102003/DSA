public class Above_SecondaryDiagonal
{
    public static void main(String[] args) {
//        int arr[][]= {
//                            {1,2,3},
//                            {4,5,6},
//                            {7,8,9}};
//
//       // below diagonal elements
//        int n=arr.length;
//        for(int i=1;i<n;i++)
//        {
//            for(int j=n-i;j<=n-1;j++)
//            {
//                System.out.println("The elements below secondary diagonal :"+arr[i][j]);
//            }
//        }
//        System.out.println("------------------------------------------------");
//        // above diagonal elements
//        for(int i=0;i<n-1;i++)
//        {
//            for(int j=0;j<n-1-i;j++)
//            {
//                System.out.println("the elements above secondary diagonal :"+arr[i][j]);
//            }
//        }









////// to print left diagonal element
int arr1[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}};
int n = arr1.length;
        for(int i=0;i<arr1.length;i++)
        {
            {
            System.out.println(arr1[i][i]);
            if(i!= (n-2))
            System.out.println(arr1[i][n-1-i]);

         }
        }
//        int n = arr1.length;
//// right diagonal
//        for(int i=0;i<n;i++)
//{
//    for(int j=n-1-i;j<n-i;j++)
//    {
//        System.out.println(arr1[i][j]);
//    }
//}
        // to find the highest value
//    int arr[][]={{1,2},{4,67}};
//    int highest=u[0][0];
//    for(int i=0;i<u.length;i++)
//    {
//        for(int j=0;j<u.length;j++){
//        if(highest<u[i][j])
//        {
//            highest=u[i][j];
//        }
//    }}
//        System.out.println(highest);
  }}




