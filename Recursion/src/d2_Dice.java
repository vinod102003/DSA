// maze

public class d2_Dice
{
public static void printMaze(int cr ,int cc,int dr , int dc ,String ans)
{
    if(cr > dr || cc > dc)
    {
        return;
    }

    if(cr ==dr && cc == dc)
    {
        System.out.println(ans);
        return;
    }


    printMaze(cr,cc+1,dr,dc,ans+"H");
    printMaze(cr+1,cc,dr,dc,ans+"V");



}

    public static void main(String[] args) {
        printMaze(0,0,2,2,"");
    }
}
