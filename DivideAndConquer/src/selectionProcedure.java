public class selectionProcedure
{

    public static int partition(int arr[] , int l , int h)
    {
        int i=l;

        int pivot = arr[l];

        for(int j =l+1 ; j<=h ; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;

                int temp = arr[i];

                arr[i] = arr[j];

                arr[j] = temp;
            }
        }

       int temp = arr[l];

        arr[l] = arr[i];

        arr[i] = temp;

        return l;
    }



    public static int selectionnProcedure(int arr[] ,int l ,int h,int k)
    {
        if (l < h)
      {
          int m  = partition(arr,l,h);

          if(m == k-1)
          {
              return  arr[m];
          }else if (m < k-1)
          {
              return selectionnProcedure(arr,m +1 , h ,k);
          }else

              return selectionnProcedure(arr,l ,m -1 , k);
      }

        return 0;
    }





public static void main(String[] args)
{
    int arr[] = {1,3,2,4,5,6,7};


int n = arr.length;

int k = 3;

            int result =  selectionnProcedure(arr,0,n-1,k);

    System.out.println(" the kth smallest element in the array is :"+result);



}

}
