import java.util.Stack;

public class stackImpementation
{
    public static void main(String[] args)
    {
        Stack<Integer> stack1 = new Stack<>();

        // insert the elements in stack
        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(7);


        // to display top element in stack
        System.out.println("top most element in stack is :"+stack1.peek());

        // delete the element from the stack
        stack1.pop();

        // to display top element in stack
        System.out.println("top most element in stack is :"+stack1.peek());


    // search for an ain the stack
        System.out.println("Element 2 is present at position :" + stack1.search(2));

        // if the element is not present it returns -1

        // to check stack is empty or  not
        System.out.println("the given stack is empty or not? :"+stack1.isEmpty());

    }

}
