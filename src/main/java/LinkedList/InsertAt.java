package LinkedList;

public class InsertAt {

    public static ListNode head, current;

    public static void insertAt(int data, int index) {
        ListNode at = new ListNode(data);
        current = head;
        int count = 1;
        if (index == 1) {
            InsertFirst.insertFirst(data);
        } else {
            while (count < index - 1) {
                current = current.next;
                count++;
            }
            at.next = current.next;
            current.next = at;
        }
    }
}
