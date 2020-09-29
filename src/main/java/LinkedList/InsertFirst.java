package LinkedList;

public class InsertFirst {

    public static ListNode head;

    public static ListNode insertFirst(int data){
        ListNode first = new ListNode(data);
        first.next = head;
        head = first;
        return head;
    }
}
