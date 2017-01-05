package leetcode.reverseLinkedList;

public class ReverseLinkedList {
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if(m >= n)
            return head; //m >= n, will do nothing.
        
        int numOfElem = 0;
        ListNode ptr = head;
        // find out num of List
        while(ptr != null) {
            ptr = ptr.next;
            numOfElem++;
        }
        
        // construct ptr arr
        ptr = head;
        ListNode[] ptrArr = new ListNode[numOfElem];
        for (int i = 0; i < numOfElem; i++){
            ptrArr[i] = ptr;
            ptr = ptr.next;
        }
        
        //Reverse list
        ListNode prev = null; //(m-1)th node
        if(m > 1)
            prev = ptrArr[m-2];
        
        ListNode last = null; //(n+1)th node
        if(n != numOfElem)
            last = ptrArr[n-1].next;

        for (int i = 0; i < (n - m + 1); i++){
            if(n-i-1 != 0)
                ptrArr[n-i-1].next = ptrArr[n-i-2];
            else
                ptrArr[n-i-1].next = last;
        }
        
        if(prev != null)
            prev.next = ptrArr[n-1];
        ptrArr[m-1].next = last;
        
        if(m == 1)
            return ptrArr[n-1];
        else
            return head;
    }

}
