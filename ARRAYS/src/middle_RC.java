import java.util.Scanner;

public class middle_RC
{
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

        System.out.println(" the middle elements are:");
        for(int i=0;i<m;i++){
            System.out.println(arr[i][m/2]);

//        for(int j=0 ;j<m;j++)
//        {
            if(i!=m/2) // to skip the middle element
            {
                System.out.println(arr[m/2][i]);
            }
        }
    }

}
