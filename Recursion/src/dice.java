// 1d dice
public class dice
{

public static void printPaths(int curr , int des , String ans)
{

    if(curr > des)
    {
        return;
    }

    if (curr == des)
    {
        System.out.println(ans);
        return;
    }

    printPaths(curr+1 ,des ,ans+1 );
    printPaths(curr+2 ,des ,ans+2 );
    printPaths(curr+3 ,des ,ans+3 );
    printPaths(curr+4 ,des ,ans+4 );
    printPaths(curr+5 ,des ,ans+5 );
    printPaths(curr+6 ,des ,ans+6 );
}

    public static void main(String[] args)
    {
        printPaths(0,8, "");
    }
}
