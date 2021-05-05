package LinkedList;

public class Add2Numbers {

    public static ListNode head;
    public static ListNode addNumbers(ListNode l1, ListNode l2) {
       int number1 =0, number2=0, number=0;
       ListNode dummy = l1;
       while(l1 != null){
            number1 = number1*10 + l1.data;
            l1 = l1.next;
       }
       while(l2 != null){
            number2 = number2*10 + l2.data;
            l2 = l2.next;
       }

       number1 = reverseNumber(number1);
       number2 = reverseNumber(number2);
       number = reverseNumber(number1 + number2);

        if(number == 0){
            return dummy;
        }
        while(number !=0){
            ListNode ls = new ListNode(number%10);
            ls.next = head;
            head =ls;
            number = number/10;
        }
       return head;
    }

    public static int reverseNumber(int number){
        int rem =0, num =0;
       while (number != 0) {
           rem = number % 10;
           num = num * 10 + rem;
           number = number / 10;
       }
       return num;
    }
}

/*
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = l1;
        ListNode second = l2;
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;
        int sum =0, carry =0;
        while (first != null || second != null ){
            sum = carry;
            if (first != null){
                sum = sum + first.val;
                first = first .next;
            }
            if (second != null){
                sum = sum + second.val;
                second = second.next;
            }

            carry = sum / 10;

            current.next = new ListNode(sum%10);

            current = current.next;
        }
        if (carry !=0){
            current.next = new ListNode(carry);
        }

        return dummyHead.next;
    }*/