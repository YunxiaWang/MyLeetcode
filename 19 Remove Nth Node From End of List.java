/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        int size= 1;
        ListNode t= head;
        while (t.next != null) {
            size++;
            t= t.next;
        }
        t= head;
        if (n == 1) { //different when removing the last node
            for (int i= 0; i < size-2; i++) 
                t= t.next;
            t.next= null;
            return size == 1? null : head; //if size = 1, return null
        }
        for (int i= 0; i < size-n; i++) 
            t= t.next;
        t.val= t.next.val;
        t.next= t.next.next;
        return head;
    }
}
