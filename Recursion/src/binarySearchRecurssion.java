public class binarySearchRecurssion
{
    public static int binaryRecurssion(int arr[] , int low , int high , int target)
    {
       while(low<=high)
       {
       int mid = low + (high - low)/2;

       if (arr[mid] == target)
       {
           return mid;
       }
       else if(arr[mid] < target)
       {

         return   binaryRecurssion(arr,mid+1,high,target);
       }else
       {
         return   binaryRecurssion(arr,low,mid-1,target);
       }
       }
       return -1;
    }



    public static void main(String[] args)
    {

    int arr[] = {2,4,8,10,12};

    int target = 10;

    int low = 0 , high = arr.length-1;

    int result = binaryRecurssion(arr,low,high,target);

    if(result != -1)
    {
        System.out.println("the element is present at :"+result);
    }else
    {
        System.out.println("the element is not present");
    }

    }



}
