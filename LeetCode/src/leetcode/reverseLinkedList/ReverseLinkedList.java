package leetcode.reverseLinkedList;

public class ReverseLinkedList {
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        assert m!=n;
        
        int step = 0;
        ListNode prev = null; // (m - 1)th node
        ListNode first = null; // mth
        ListNode second = null; // nth
        ListNode last = null; // (n+1)th
        
        ListNode ptr = head;
        while(ptr.next != null) {
            if(step+1 == m) {
               if(m == 1) {
                   first = head;
                   prev = null;
               }
               else {
                   first = ptr.next;
                   prev = ptr;
               }
            }
            
            if(step == n) {
                second = ptr;
                last = ptr.next;
            }
            
            ptr = ptr.next;
            step++;
        }
        
        ListNode cur = first.next;
        ListNode next = cur.next;
        
        if(m == 1) 
            second = head;
        else 
            prev.next = second;
        first.next = last;
        
        do {
            cur.next = first;
            ListNode temp = next;
            next.next = cur;
            first = cur;
            cur = next;
            next = temp.next;
        } while (next.next != second);
        
        return head;
    }

}
