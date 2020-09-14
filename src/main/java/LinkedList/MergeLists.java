package LinkedList;

import java.util.Arrays;

public class MergeLists {

    public static void mergeLists(){
        int i;
        int a[] = {1, 4, 5, 9};
        int b[] = {2, 4, 5, 10, 12};
        int length = a.length + b.length;

        int c[] = new int[length];
        int k = 0, l = 0;
        for (i = 0; i < length; i++) {
            if (k < a.length - 1) {

            }
            {
                if (a[k] < b[l]) {
                    c[i] = a[k];
                    k++;
                }
            }
        }
        if (l < b.length - 1) {
            if (a[k] > b[l]) {
                c[i] = b[l];
                l++;
            } else {
                c[i] = a[k];
                k++;
                l++;
            }
        }
        System.out.println(Arrays.toString(c));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = null;
        if (l1.data < l2.data){
            dummy = l1;
            l1 = l1.next;
        }
        else{
            dummy = l2;
            l2 = l2.next;
        }
        ListNode temp = dummy;
        while (l1.next != null && l2.next !=null){

            if(l1.data < l2.data){
                temp.data = l1.data;
                temp = temp.next;
                l1 = l1.next;
            }
            else {
                temp.data = l2.data;
                l2 = l2.next;
                temp = temp.next;
            }

        }
        return dummy;
    }
}
