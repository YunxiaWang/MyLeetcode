/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        ListNode fast= head;
        ListNode slow= head;
        while (fast.next != null && fast.next.next != null) {
            fast= fast.next.next;
            slow= slow.next;
            if (fast == slow) break;
        }
        if (fast.next == null || fast.next.next == null) return null; //注意结束循环的条件判断
        if (fast == head && slow == head) return head; //如果头尾相接
        fast= head;
        while (true) {
            fast= fast.next;
            slow= slow.next;
            if (fast == slow) return slow;
        }
    }
}
