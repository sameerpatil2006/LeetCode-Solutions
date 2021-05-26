package LinkedList;

public class CreateList {
    public static ListNode createList(){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);

        return l1;
    }

    public static ListNode createList2(){
        ListNode l1 = new ListNode(5);
        l1.next = new ListNode(6);
        l1.next.next = new ListNode(7);
        l1.next.next.next = new ListNode(8);

        return l1;
    }
}
