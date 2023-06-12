public class permetationString
{

    public static String swap(String str , int i ,int j)
    {

        char temp;

        char charArray[] = str.toCharArray();

         temp = charArray[i];

        charArray[i] = charArray[j];

        charArray[j] = temp;

        return String.valueOf(charArray);
    }

public static void permute(String str , int l ,int r)
{
    if(l == r)
    {
        System.out.println(str);
    }
    else
    {
        for(int i=l ; i<=r ; i++)
        {
                str =  swap(str,l,i);

            permute(str,l+1,r);

            //back tracking - undo swap
         str  = swap(str,l,i);

        }
    }
}

    public static void main(String[] args)
    {
                String str = "xy";

                int n = str.length();

                System.out.println("Permutation for the string : "+ str+" are : ");
        permute(str,0,n-1);

                String str1 = "ABC";
                int n1 = str1.length();
        System.out.println("Permutation for the string : "+ str1+" are : ");
        permute(str1,0,n1-1);

    }

}
