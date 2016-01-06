/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 /* 注意保留和删除旧节点信息 */
 /* Reversed iteratively */
public class Solution {
    public ListNode reverseList(ListNode head) {
        // if (head == null || head.next == null) return head; // can be deliminated
        ListNode pre = null; //store the node before current node
        ListNode cur = head; //store the current node
        while (cur != null){
            ListNode t = cur.next; //store value first
            cur.next = pre; //reverse
            pre = cur; //move pre forward one node
            cur = t; //move cur forward one node
        }
        return pre;
    }
}

 /* Reversed recursively */
 public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head; //must
        ListNode t = head.next; //t!=null
        ListNode newHead = reverseList(t); //find until the last node in the old list
        t.next = head; //reverse
        head.next = null; //set null for the old node's next
        return newHead;
    }
}
