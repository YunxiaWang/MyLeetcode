/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        //if (head == null || head.next == null) return head; // can be eliminated
        ListNode t = head;
        while (t != null && t.next != null){
            if (t.val == t.next.val){
            t.next = t.next.next;
            //t.next.next = null; // no need to delete, will cause null pointer exception for last node
            }
            else t = t.next; // use 'else', if ==, check the current node again, if !=, move on
        }
        return head;
    }
}
