public class ll_Intersection
{

    ListNode head;

    class ListNode
    {

        int data;
        ListNode next;

        ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }

    }

    public void createIntersectingLists() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        // First linked list: 1 -> 2 -> 3 -> 4
        ListNode headA = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Second linked list: 5 -> 3 -> 4
        ListNode headB = node5;
        node5.next = node3;
        node3.next = node4;

        // Call the getIntersectionNode method passing headA and headB to find the intersection point
        ListNode intersectionNode = getIntersectionNode(headA, headB);
        System.out.println("Intersection Node: " + intersectionNode.data);
    }


    public int lengthL(ListNode head)
    {
        int count = 0;

        while(head != null)
        {
            head = head.next;
            count ++;
        }
        return count;
    }

public ListNode getIntersectionNode(ListNode headA,ListNode headB)
{
int lA = lengthL(headA);

int lB = lengthL(headB);

int diff = 0;

ListNode cA = null;
ListNode cB = null;

if(lA > lB)
{
    cA = headA;
    cB = headB;

    diff = lA - lB;
}else
{
    cA = headB;
    cB = headA;

    diff = lB - lA;

}


    while(diff != 0)
    {
        cA = cA.next;
        diff --;
    }

    while(cA !=null && cB!= null)
    {
        if(cA == cB)
        {
            return cA;
        }else
        {
            cA = cA.next;
            cB = cB.next;
        }
    }

return null;

}

    public static void main(String[] args) {
        ll_Intersection obj = new ll_Intersection();

        obj.createIntersectingLists();
    }




}
