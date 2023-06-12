public class d1_palindrome_array
{
    public static void main(String[] args) {
        int arr[]={1,2,3,3,2,1};
        int flag =0;
        //time complexity is O(n) space is O(1)
        for(int i=0;i<arr.length/2;i++)
        {
            if(arr[i]!=arr[arr.length-1-i])
            {
                flag=1;
                System.out.println("the given array is not a palindrome");
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("the given array is  a palindrome");

        }
    }
}
