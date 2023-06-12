class space {
    void print() {
        String hello = "hello,world";
        System.out.println(hello);
    }// here the space complexity is O(1)

    int[] copyArray(int arr[]) {
        int copy[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            copy[i] = arr[i];
        //    System.out.println(copy[i]);

        }

        return copy;
    }

    // space complexity is O(n)
    int f(int n)
    {
        if (n<=0)
        {
          return 0;

        }else
            return n+f(n-1);
    }
}
public class complexity_space
{
    public static void main(String[] args)
    {
space s = new space();
s.copyArray(new int[]{1,2,34,4});
s.f(4);

    }




}
