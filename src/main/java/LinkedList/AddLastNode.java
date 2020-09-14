package LinkedList;

public class AddLastNode {

    public static ListNode head, current;
    public static ListNode addLast(int data) {
        ListNode ls = new ListNode(data);
        if (head == null) {
            head = ls;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = ls;
        }
        return head;
    }
}
