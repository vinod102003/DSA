import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queueImpementation
{
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();

        // to insert the data in the queue - enqueue
        for(int i=0 ; i<10 ; i++)
        {
            q.add(i);
        }

        System.out.println("Queue looks like :"+q);

        System.out.println("Topmost element in the queue is :"+ q.peek());


        q.remove();

        System.out.println("After the deletion isTopmost element in the queue is :"+ q.peek());

        System.out.println("the size of the queue is "+ q.size());
    }
}
