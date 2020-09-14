package LinkedList;

public class IsCircular {

    public static void circular(ListNode head){
        ListNode root = head;
        boolean flag = true;
        while (head.next != null || head.next == root){
            if(head.next == null){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
