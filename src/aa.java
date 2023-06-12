import java.util.LinkedList;

public class aa
{
    public  static void findTarget(LinkedList<Integer> ll , int target)
    {
        int flag = -1;
       for(int i=0 ; i<ll.size() ; i++)
       {
          if ((target == ll.get(i)))
          {
              flag = 1;
              System.out.println("yes");
          }
       }
       if(flag == -1)
       {
           System.out.println("no");
       }

    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList();

        ll.addLast(12);
        ll.addLast(2);
        ll.addLast(234);
        ll.addLast(287);

        int target = 2;


       findTarget(ll , target);


    }
}
