import java.util.Scanner;
public class d2_array
{
    public static void main(String[] args) {
//        int arr[][] = {
//                        {10,20,30,40,50},
//                        {60,70,80,90,100},
//                        {110,120,130,140,150},
//                        {160,170,180,190,200}};
//        //System.
//        // out.println(arr[3][1]);
//
//    for (int i=0;i<arr.length;i++)
//    {
//        for (int j=0;j<arr[i].length;j++)
//        {
//            System.out.print(arr[i][j]+" ");
//        }
//        System.out.println(" ");
//    }
  Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the numbers of rows");
//    int rows = sc.nextInt();
//        System.out.println("Enter the number f columns");
//        int columns=sc.nextInt();
//        // int arr[][]=new int[rows][columns];
////        for (int i=0;i<rows;i++)
////        {
////            for (int j=0;j<columns;j++)
////            {
////                arr[i][j]=sc.nextInt();
////            }
////        }
////        System.out.println("answer");
////        for (int i=0;i<rows;i++)
////        {
////            for (int j=0;j<columns;j++)
////            {
////                System.out.print(arr[i][j]+" ");
////            }
////            System.out.println(" ");
////        }

        System.out.println("enter the number of rows");
        int row=sc.nextInt();
        System.out.println("enter the number of columns");
        int colum=sc.nextInt();
// declaring the array
        int ui[][] = new int[row][colum];
    //initialising the array with 10
        for (int i=0;i<4;i++)
    {
        for (int j=0;j<5;j++)
        {
            ui[i][j]=10;
        }
    }

    // printing the array
        for (int i=0;i<row;i++)
    {
        for (int j=0;j<colum;j++)
        {
            System.out.print(ui[i][j]+" ");
        }
        System.out.println(" ");
    }


    }

}
