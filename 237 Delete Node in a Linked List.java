/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        ListNode t = node.next.next; //use temp node to store value to avoid null pointer exception when doing null deleting
        node.next = t;
        t = null;
    }
}

/* Can be not deleted? WHY! */
public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        //ListNode t = node.next.next;
        node.next = node.next.next;
        //t = null;
    }
}
