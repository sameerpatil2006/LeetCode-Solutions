package LinkedList;

public class RemoveFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        int count=0, end;
        while(current != null){
            current = current.next;
            count++;
        }
        end = count - n;
        if(end == 0){
            return head.next;
        }
        current = head;
        for(int i=0; i<end && current!=null ; i++){
            if(end-1 == i) {
                current.next = current.next.next;
            }
            current = current.next;
        }
        return head;
    }
}
