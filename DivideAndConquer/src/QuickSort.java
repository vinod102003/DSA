public class QuickSort
{
    public static int partition(int arr[] , int l,int h)
    {
        int pivot = arr[l];
        int i=l;

        for(int j=l+1 ; j<=h ; j++)
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

    public static void quickSort(int arr[] , int l ,int h)
    {

       if(l>=h)
       {
           return;
       }

       if(l<h)
       {
            // 1 divide the array into two sub problem
            int mid = partition(arr,l,h);

            //  2 conquer the sub problem
            quickSort(arr,l,mid -1);

            quickSort(arr,mid+1,h);
        }
    }


    public static void print(int arr[],int n)
    {
        for (int i=0 ; i< n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }


    public static void main(String[] args)
    {

        int arr[] = {40,70,60,20,10,90};

        int n = arr.length;

        System.out.println("Array before sorting is: ");

        print(arr,n);

        quickSort(arr,0,n-1);

        System.out.println("Array after the sorting is: ");
        print(arr,n);



    }
}
