import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stackUsingQueue
{

   static Queue<Integer> q1 = new LinkedList<>();
   static Queue<Integer> q2 = new LinkedList<>();

   // add an element in stack
    static void add(int data)
    {
        // 1 move all the data from q1 to q2
        while(!q1.isEmpty())
        {
            q2.add(q1.peek());

            q1.poll();
        }

        //2 insert the new data
        q1.add(data);

        //3 move all the data from q2 to q1
        while(!q2.isEmpty())
        {
            q1.add(q2.peek());
            q2.poll();
        }

    }

    static int  remove()
    {
        if(q1.isEmpty())
        {
            System.out.println("stack underflow");
        }


       int elem = q1.poll();

        return elem;
    }

    public static void main(String[] args) {

       stackUsingQueue s = new stackUsingQueue();

       s.add(1);
       s.add(2);
       s.add(3);
       s.add(4);


        System.out.println(s.remove());

    }

}
