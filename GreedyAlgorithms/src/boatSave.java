import java.util.Arrays;

public class boatSave
{


    public static int numberofboat(int weight[] , int limit)
    {
        Arrays.sort(weight);

        int bc = 0;
       int light = 0 , heavy = weight.length-1;

      while (light <= heavy)
      {
          if(weight[light] + weight[heavy] <=limit)
          {
              light++;
              heavy--;
          }else
          {
              heavy--;
          }
          bc++;
      }

        return bc;
    }

    public static void main(String[] args) {
        int weight[] = {3,2,2,2,1};
        int limit= 3;

       int res  =numberofboat(weight,limit);
        System.out.println(res);
    }
}
