public class LL
{
    Node head;
    class Node
    {
        int data;

        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

public void addLast(int data)
{
    Node newNode = new Node(data);

   if( head == null)
   {
       head = newNode;
       return;
   }

   Node currNode = head;

    while(currNode.next != null)
    {
        currNode = currNode.next;
    }

    currNode.next = newNode;
}
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }

       newNode.next = head;

        head = newNode;


    }

    // display all the nodes after the insertion
    public  void printNodes()
    {

            Node current = head;

        while(current != null)
        {
            System.out.print(current.data+" ");

            current = current.next;
        }
    }

public void insertAtAnyNode( Node prev_node, int data)
{
    if(prev_node == null)
    {
        System.out.println("The Previous node cannot contain the null values");
    }
    Node newNode = new Node(data);

    newNode.next = prev_node.next;

    prev_node.next = newNode;
}
public void deleteNode(int position)
{

   if(head == null)
   {
       return;
   }

    Node temp = head;

        if(position == 0)
        {
            head = temp.next;
        }
        else
        {
            for(int i=0 ; temp!= null && i<position - 1 ; i++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;
        }
}

//public void reverse(Node curr , Node prev)
//{
//    if(curr.next == null)
//    {
//        head = curr;
//        curr.next = prev;
//        return;
//    }
//
//    Node nextNode = curr.next;
//
//    curr.next = prev;
//
//    reverse(nextNode,curr);
//}

    public void reverse()
    {
        Node curr = head;

        Node prev = null;

        Node nextPtr = null;

        while(curr != null)
        {
            nextPtr = curr.next;

            curr.next = prev;

            prev = curr;

            curr = nextPtr;

        }

        head = prev;
        return;

    }
    public static void main(String[] args)
    {

    LL llist = new LL();

    llist.addLast(123);

    llist.addFirst(23445);

    llist.addFirst(234);

    llist.addFirst(12);

    llist.addLast(23);

    llist.insertAtAnyNode(llist.head.next.next, 234);

    llist.deleteNode(2);

        System.out.println("Before reverse");
        llist.printNodes();

        System.out.println("linked list after successful insertion of all nodes:");
    //    llist.reverse(llist.head, null);

      llist.reverse();

        llist.printNodes();



    }
}
