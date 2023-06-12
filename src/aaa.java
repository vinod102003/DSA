public class aaa
{


    public static void rat(int arr[][],int cr , int cc , int dr , int dc , String ans)
    {
        if(cr == dr && cc == dc)
        {
            System.out.println(ans);
        }

       if(cc < 0 || cr < 0 || cr > dr || cc > dc || arr[cr][cc] == -1)
       {
           return;
       }

       arr[cr][cc] = -1;

       rat(arr,cr+1,cc,dr,dc,ans+"D");
       rat(arr,cr,cc+1,dr,dc,ans+"R");
       rat(arr,cr-1,cc,dr,dc,ans+"U");
       rat(arr,cr,cc -1,dr,dc,ans+"L");


       arr[cr][cc] = 0;




    }
    public static void main(String[] args)
    {
        int arr [][] =
                {
                        {0,0,0,0},
                        {0,-1,0,0},
                        {-1,0,0,0},
                        {0,0,0,0}};


                rat(arr,0,0,2,2,"");



    }
}

