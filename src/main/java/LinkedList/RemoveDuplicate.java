package LinkedList;

public class RemoveDuplicate {

    public static void removeDuplicate(ListNode head){
        ListNode current = head;
        ListNode next;
        while (current != null && current.next != null){
            if (current.data == current.next.data){
                next = current.next.next;
                current.next = next;
            }
            if (current.data != current.next.data){
                current = current.next;
            }
        }
    }
}
