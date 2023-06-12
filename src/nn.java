import java.util.ArrayList;
import java.util.Arrays;

public class nn
{

 static class  job
{
    int job_id;
    int deadline;

    int profit;

    job(int job_id,int deadline,int profit)
    {
        this.job_id = job_id;
        this.deadline=deadline;
        this.profit=profit;
    }

}


void getJob(job arr[] , int maxDeadline)
{

    Arrays.sort(arr,(a,b)-> b.profit - a.profit);


    boolean  check[] = new boolean[maxDeadline];

    int job_s[] = new int[maxDeadline];

   for(int i=0 ; i<arr.length ; i++)
   {
      for(int j = Math.min(maxDeadline -1 , arr[i].deadline-1 ); j>=0 ; j--)
      {
          if (check[j] == false)
          {
              check[j] = true;
              job_s[j] = arr[i].job_id;
              break;
          }
      }
   }


   for(int i:job_s)
   {
       System.out.print(i);
   }
    System.out.println();
}
    public static void main(String[] args)
    {
        job arr[] = {


        new job(1,5,55),
        new job(2,2,65),
        new job(3,7,75),
        new job(4,3,60),
        new job(5,2,70),
        new job(6,1,50),
        new job(7,4,85),
        new job(8,5,68),
                new job(9,3,45)

    };


        nn n = new nn();
        n.getJob(arr,7);


    }









}
