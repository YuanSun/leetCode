package leetcode.reverseLinkedList;

/**
 *
 * @author ysun
 */
public class ReverseListMain {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode ptr = head;
        for (int i = 2; i <= 10; i++) {
            ptr.next = new ListNode(i);
            ptr = ptr.next;
        }
        
        System.out.println("Original linked list is:" );
        ptr = head;
        while(ptr != null) {
            ptr.displayNode();
            ptr = ptr.next;
        }
        
        ReverseLinkedList.reverseBetween(head, 2, 5);
        
        System.out.println("Reversed linked list is:" );
        ptr = head;
        while(ptr.next != null) {
            ptr.displayNode();
            ptr = ptr.next;
        }
    }
}
