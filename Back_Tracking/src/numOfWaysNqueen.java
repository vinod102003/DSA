public class numOfWaysNqueen
{


        public static void print(int arr[][])
        {
            for(int i=0 ; i<arr.length ; i++)
            {
                for(int j=0 ; j<arr.length ; j++)
                {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }

        public static boolean isSafe(int arr[][] , int row , int col)
        {
            // hori
            for(int i=0 ; i<arr.length ; i++)
            {
                if(arr[row][i] == 1)
                {
                    return false;
                }
            }


            // veri
            for(int i=0 ; i< arr.length ; i++)
            {
                if(arr[i][col] == 1)
                {
                    return false;
                }
            }


            // up left
            for(int r=row ,c=col ; r>=0 && c>=0 ; r--,c--)
            {
                if(arr[r][c] == 1)
                {
                    return false;
                }
            }


            // up right
            for(int r=row ,c=col ; r>=0 && c<arr.length ; r--,c++)
            {
                if(arr[r][c] == 1)
                {
                    return false;
                }
            }

            // down left
            for(int r=row ,c=col ; r< arr.length && c>=0 ; r++,c--)
            {
                if(arr[r][c] == 1)
                {
                    return false;
                }
            }

            // down right

            for(int r=row ,c=col ; r< arr.length && c< arr.length ; r++,c++)
            {
                if(arr[r][c] == 1)
                {
                    return false;
                }
            }


            return true;
        }

        public static int solve(int arr[][] , int col)
        {

            int count = 0;

            if(col == arr.length)
            {
                return 1;
            }

            for(int i=0 ; i<arr.length; i++)
            {
                if(isSafe(arr,i,col))
                {
                    arr[i][col] = 1;

                    count +=solve(arr,col+1);

                    arr[i][col] = 0;
                }
            }
            return count;
        }

        public static void main(String[] args)
        {

            int arr[] []  =  {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};


            int count  = solve(arr,0) ;

            System.out.println(count);


        }





    }

