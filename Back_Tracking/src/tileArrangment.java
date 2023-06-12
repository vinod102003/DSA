// given a board of size 2*n and tile of 2*1 in how many ways a tile can be arranged
// a tile can be arranged vertically and horizontally
// vertical = 2*1  hori = 1*2
// when n = 1 only 1 way i.e is 1v
// when n = 2 only 2 way i.e is 2v either 2h
// when n = 3 only 3 way i.e is 2v , 1h either 2h,1v or 3v
// when n = 4 only 5 way i.e is 4v / 4h / 2v,2h / 2h,2v / 1v,2h,1v

public class tileArrangment
{
    public static int getWays(int n)
    {
        // base case
        if(n<=3)
        {
            return n;
        }else
        {

            return getWays(n-1)+getWays(n-2);
        }
    }
    public static void main(String[] args)
    {
        System.out.println("For n = 1 , total ways :"+ getWays(1));
        System.out.println("For n = 2 , total ways :"+ getWays(2));
        System.out.println("For n = 3 , total ways :"+ getWays(3));
        System.out.println("For n = 4 , total ways :"+ getWays(4));
        System.out.println("For n = 5 , total ways :"+ getWays(5));





    }
}