public class cycle_detection
{
        Node head;

        class Node
        {
            int data;

            Node next;

            Node(int d)
            {
                data = d;
                next = null;
            }
        }


//    public static void main(String[] args) {
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

    // cycle in ll
    public void detectLoop()
    {
        Node slow =head;

        Node fast= head;

        int flag = 0;

        while(slow!= null && fast!= null && fast.next != null)
        {
            slow = slow.next;

            fast= fast.next.next;

            if(slow == fast)
            {
                flag =1;
                break;
            }
        }

        if ( flag == 0)
        {
            System.out.println("no loop detected");
        }else
        {
            System.out.println("loop is detected");
        }


    }




public void print()
{
    Node temp = head;
    while (temp !=null)
    {
        System.out.print(temp.data+" ");
        temp = temp.next;
    }



    System.out.println();
}

public static void main(String[] args)
{
        cycle_detection cc = new cycle_detection();
        cc.addLast(12);

        cc.addFirst(123);
        cc.print();

        Node curr = cc.head;

        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = cc.head;


        cc.detectLoop();



        }

}
