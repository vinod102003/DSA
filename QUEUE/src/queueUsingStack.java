import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queueUsingStack
{
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    // insertion of new element in the stack
    // tc is O(1)
    static void enQueue(int data)
    {
        stack1.push(data);
    }

    // O(n) because of while loop
    // to remove the element from the stack
   static int deQueue()
   {
       int elem;

       if(stack1.empty() && stack2.empty())
       {
           System.out.println("no elements to delete");
           System.exit(0);
       }

       if(stack2.empty())
       {
           while(!stack1.empty())
           {
               elem = stack1.pop();

               stack2.push(elem);
           }
       }

       elem = stack2.pop();
       return elem;
   }

    public static void main(String[] args)
    {
        queueUsingStack q = new queueUsingStack();

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);

        System.out.println(q.deQueue());




    }
}
