package LinkedList;

public class InsertFirst {

    public static ListNode head;

    public static void insertFirst(int data){
        ListNode first = new ListNode(data);
        first.next = head;
        head = first;
    }
}
