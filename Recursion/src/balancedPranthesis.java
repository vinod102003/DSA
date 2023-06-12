public class balancedPranthesis
{
public static void printCombs(int n , int oc , int cc, String ans)
{
    if(n ==oc  && n==cc)
    {
        System.out.println(ans);
        return;
    }
    if(oc < n)
    {
        printCombs(n , oc+1 , cc , ans+'(');
    }
    if (oc > cc)
    {
        printCombs(n , oc , cc+1 , ans+')');
    }

}
    public static void main(String[] args)
    {
//        int n = 2;
//        int oc = 0;
//        int cc = 0;
//        String ans = "";

        printCombs(2,0,0,"");

    }
}
