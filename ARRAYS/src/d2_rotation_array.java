import java.util.Arrays;

public class d2_rotation_array
{

    public static  void rotatedMatrix(int arr[][])
    {
        // write the code
        // step1: Transpose the 2D Array
        for(int i=0 ; i< arr.length ; i++)
        {
            for(int j=i ; j< arr.length ; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //step2:swap left and right columns
        for(int i=0; i<arr.length; i++)
        {
            int li = 0;

            int ri = arr.length-1;

            while(li < ri)
            {
                int temp = arr[i][li];

                arr[i][li] = arr[i][ri];

                arr[i][ri] = temp;

                li++;
                ri--;
            }
        }

//time complexity is O(n^2)
// space complexity is O(1)


    }
    public static void main(String[] args)
    {
int arr[][]={   {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

// rotation by 90 degree

// Function calling
rotatedMatrix(arr);

// converting array to string to get proper display a matrix like format
    for (var mat:arr)
{
    System.out.println(Arrays.toString(mat));

}

//for (int y[]:arr)
//{
//    for (int g:y)
//    {
//        System.out.print(g+" ");
//    }
//    System.out.println(" ");
//}

    }
}
