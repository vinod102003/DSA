public class interRatInMaze
{
    static int count = 0;
    public static void printMaze(int maze[][],int cr , int dr , int cc , int dc , String ans)
    {

        if( cr < 0 || cc< 0 || cr > dr || cc > dc || maze[cr][cc] == -1)
        {
            return;
        }



        // base
         if(cr == dr && cc == dc)
        {
           System.out.println(ans);
           count++;
            return;

        }


        // make our current element visited so that we will repeat
        maze[cr][cc] = -1;



         printMaze(maze,cr+1,dr,cc,dc,ans+"D");

         printMaze(maze,cr,dr,cc+1,dc,ans+"R");

                printMaze(maze,cr - 1,dr , cc ,dc, ans+"U");

                printMaze(maze,cr,dr,cc-1,dc,ans+"L");

                // backtrack to find all the possible output(unvisited)
            maze[cr][cc] = 0;
    }
    public static void main(String[] args)
    {
        int maze [][] =
                {
                {0,0,0,0},
                {0,-1,0,0},
                        {-1,0,0,0},
                {0,0,0,0}};

        printMaze(maze,0,3,0,3,"");
        System.out.println("the number ways are :"+count);
    }
}
