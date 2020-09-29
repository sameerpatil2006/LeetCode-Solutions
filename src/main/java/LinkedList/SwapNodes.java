package LinkedList;

public class SwapNodes {
// NOT COMPLETE SOLUTION
    public static ListNode swapPairs(ListNode head) {
        ListNode current = head;
        ListNode root,temp;
        int count =1;
        while (current !=null){
            if(count ==1) {
                temp =current;
                root = temp.next;
                root.next = temp;
                count = 0;
                current = current.next;
            }
            else {
                count++;
                current = current.next;
            }
        }

        return head;
    }

}
