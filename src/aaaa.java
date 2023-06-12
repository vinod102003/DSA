public class aaaa
{

   public static void main(String[] args) {

      int arr[] = {-1,-2,-3,-4,5,6,7,8};

      int l = 0;

      int smallest = l;
            for(int i=l ; i<arr.length ; i++)
            {
               if(arr[i] < 0)
               {
                  int temp = arr[i];

                  arr[i] = arr[smallest];
                  arr[smallest] = temp;
                  smallest++;
               }
            }


            for(int i=0 ; i<arr.length ; i++)
            {
               System.out.println(arr[i]);
            }

   }





}
