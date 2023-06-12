public class deleteNoadeNOhead
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


    void deleteNoHead(Node curr)
    {
        int temp = curr.data;
        curr.data  = curr.next.data;
        curr.next.data = temp;

        curr.next = curr.next.next;

//// we just copy the next data in curr and refer curr.next to next.next
//        curr.data = curr.next.data;
//        curr.next = curr.next.next;


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

    public static void main(String[] args) {


        deleteNoadeNOhead d = new deleteNoadeNOhead();

        d.addFirst(9);
        d.addFirst(1);
        d.addFirst(5);
        d.addFirst(4);

      // d.print();

       Node curr = d.head.next;

d.deleteNoHead(curr);

d.print();


    }

}
