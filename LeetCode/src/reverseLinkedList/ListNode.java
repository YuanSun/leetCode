package reverseLinkedList;

/**
 *
 * @author ysun
 */
public class ListNode {
    public int iData;
    public double dData;
    public ListNode next;
    
    public ListNode(int id, double... dd) {
        iData = id;
        if (dd != null && dd.length == 1)
            dData = dd[0];
        else
            dData = Double.NaN;
    }
    
    public void displayNode() {
        if(dData == Double.NaN)
            System.out.print("{" + iData + "} -> ");
        else
            System.out.print("{" + iData + ", " + dData + "} -> ");
        
    }
}
