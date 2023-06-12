public class oddEvenLinked
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
        return;

    }

    public void oddEven(Node head)
    {



        Node odd = head;

        Node evenHead = head.next; // this is taken for linkage b/w even and odd

        Node even= head.next;


        while(odd!= null && even != null && even.next != null)
        {
            odd.next = odd.next.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next;
        }


        // linking the odd and even
        odd.next = evenHead;






    }





    void print()
    {
Node curr = head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }


    }




    public static void main(String[] args)
    {

        oddEvenLinked oe = new oddEvenLinked();

        oe.addFirst(6);
        oe.addFirst(4);
        oe.addFirst(3);
        oe.addFirst(5);
        oe.addFirst(10);

        //oe.print();
// 10 -> 5 -> 3-> 4-> 6 -> null
        oe.oddEven(oe.head);

        System.out.println("The odd even link :");

        oe.print();



    }
}
