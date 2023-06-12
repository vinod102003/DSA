public class nQueenProblem
{

    public static boolean isSafe(char [][] board , int row , int col)
    {
        // for horizontal
        for(int j=0 ; j<board.length ; j++)
        {
            if(board[row][j] == 'Q')
            {
                return false;
            }
        }

        // for vertical
        for(int i=0 ; i<board.length ; i++)
        {
            if(board[i][col] == 'Q')
            {
                return false;
            }
        }

        // for upper left
        for(int r=row , c=col ; r>=0 && c>=0 ; r--,c--)
        {
            if(board[r][c] == 'Q')
            {
                return false;
            }
        }

        // for upper right
        for(int r=row,c=col ; c<board.length && r>=0 ; c++,r--)
        {
            if(board[r][c] == 'Q')
            {
                return false;
            }
        }

        // for lower left
        for(int r=row,c=col ; r<board.length && c>=0 ; r++,c--)
        {
            if(board[r][c] == 'Q')
            {
                return false;
            }
        }

        // lower right
        for(int r=row,c=col ; r<board.length && c<board.length ; r++,c++)
        {
            if(board[r][c] == 'Q')
            {
                return false;
            }
        }

        return true;
    }


    static   public boolean helper(char [][] board , int col )
    {
        if(col == board.length)
        {
            return true;
        }


        for(int i=0 ; i<board.length ; i++ )
        {
           if(isSafe(board,i,col))
           {
               board[i][col] = 'Q';

               //
              if (helper(board,col+1))
              {
                  return true;
              }

               board[i][col] = '-';

           }
        }
return false;
    }

    public static void print(char [][] board )
    {
        for(int i=0 ; i<board.length ;i++)
        {
            for(int j=0 ; j<board.length ; j++)
            {
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args)
    {

        char [][] board = {{'-','-','-','-'},
                            {'-','-','-','-'},
                            {'-','-','-','-'},
                            {'-','-','-','-'}};

      if (helper(board,0) == true){

          print(board);
    }
      else
      {
          System.out.println("no");
      }
}
}