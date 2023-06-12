public class middle_value
{


    Node head;
    class Node {
        int data;

        Node next;


        Node(int d)
        {
            data = d;
            next = null;
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
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null)
        {
                    temp = temp.next;
        }

        temp.next = newNode;

    }


    public void middleValue()
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;

            fast = fast.next.next;
        }

        System.out.println("middle value is "+slow.data);

    }

    public void insertAny(Node prev , int data)
    {
        Node newNode = new Node(data);
           if(prev ==  null)
           {
               System.out.println("previous node can't be null");
           }

           newNode.next = prev.next;
           prev.next = newNode;

    }
    public void print()
    {

        Node curr = head;

        while(curr != null)
        {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();

    }



    public static void main(String[] args)
    {

    middle_value m = new middle_value();

            m.addFirst(2);
            m.addFirst(4);
            m.addLast(6);
            m.addLast(8);
            m.addLast(12);



            m.print();

       m.middleValue();




    }


}

