package LinkedList;

public class PrintList {

    public static ListNode head;
    public static void showList(){
        ListNode node = head;
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

}
