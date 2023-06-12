public class selectionProceduerBruteForce
{



    public static int sort(int arr[])
    {

        for(int i=1 ; i < arr.length ; i++)
        {
             int j= i;
            while(j > 0 && arr[j] < arr[j-1])
            {
                int temp = arr[j];

                arr[j] = arr[j-1];

                arr[j-1] = temp;
                j--;


            }

        }

        return arr[2];
    }
    public static void main(String[] args) {


       int  arr[]  =  {10,50,20,70,60,30};

        int k =3 ; // third smallest number in the array

        System.out.println("the third smallest elem in the array is :"+sort(arr));






    }

}
