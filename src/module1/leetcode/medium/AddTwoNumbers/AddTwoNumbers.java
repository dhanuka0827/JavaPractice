package module1.leetcode.medium.AddTwoNumbers;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = createListNode(2,4,3);
        ListNode l2 = createListNode(5,6,4);

        ListNode l3 = addTwoNumbers(l1, l2);
        while (l3!=null){
            System.out.println("Num :"+l3.val);
            l3 = l3.next;
        }
    }

    private static ListNode createListNode(int i, int i1, int i2) {
        ListNode l1 = new ListNode(i);
        ListNode l2 = new ListNode(i1);
        ListNode l3 = new ListNode(i2);
        l1.next = l2;
        l2.next = l3;
        l3.next =null;

        return l1;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode l3 = dummy;
        int carry = 0;
        int tempSum = 0;
        while(l1!=null || l2!=null || carry !=0){
            tempSum = 0;
            if(l1!=null){
                tempSum += l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                tempSum += l2.val;
                l2=l2.next;
            }

            tempSum += carry;
            dummy.next = new ListNode(tempSum%10);
            dummy = dummy.next;
            carry = tempSum/10;
        }
        return l3.next;
    }
}
