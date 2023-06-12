import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Job_Scheduling
{

char id;
int deadline , profit;

public Job_Scheduling()
{}

public Job_Scheduling(char id , int deadline , int profit)
{
    this.id = id;

    this.deadline = deadline;

    this.profit = profit;
}

void printJobSequence(ArrayList<Job_Scheduling> arr , int maxDeadline)
{
    // 1.sort the arr in order of decrease order of profit

Collections.sort(arr,(a,b) -> b.profit - a.profit);


boolean result[] = new boolean[maxDeadline];

char job[] = new char[maxDeadline];


for(int i=0 ; i<arr.size() ; i++)
{
    for(int j = Math.min(maxDeadline-1 , arr.get(i).deadline - 1); j>=0 ; j--)
    {
        if(result[j] == false)
        {
            result[j] = true;

            job[j] = arr.get(i).id;
            break;   // imp to break it here if not will get wrong answers
        }
    }
}


for(char i:job)
{
    System.out.print(i+" ");
}
    System.out.println();

}
    public static void main(String[] args)
    {

        ArrayList<Job_Scheduling>  arr = new ArrayList<>();

        arr.add(new Job_Scheduling('1',5,55));
        arr.add(new Job_Scheduling('2',2,65));
        arr.add(new Job_Scheduling('3',7,75));
        arr.add(new Job_Scheduling('4',3,60));
        arr.add(new Job_Scheduling('5',2,70));
        arr.add(new Job_Scheduling('6',1,50));
        arr.add(new Job_Scheduling('7',4,85));
        arr.add(new Job_Scheduling('8',5,68));
        arr.add(new Job_Scheduling('9',3,45));


        System.out.println("job sequence order to get the maximum profit is: ");

        Job_Scheduling job = new Job_Scheduling();

        job.printJobSequence(arr,7);

    }

}
