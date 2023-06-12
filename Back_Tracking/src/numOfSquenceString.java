public class numOfSquenceString
{
    public static void gss(String s, String ans)
    {
        if(s.length() == 0)
        {
            System.out.println(ans);
            return;
        }

        // include
        gss(s.substring(1),ans+s.charAt(0));


        // not include
        gss(s.substring(1),ans);

    }
    public static  void main(String[] args)
    {
        gss("12","");
    }

}
