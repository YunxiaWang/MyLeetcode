/* http://www.cnblogs.com/hiddenfox/p/3408931.html 好整理 
复杂度O(n)的方法，使用两个指针slow,fast。两个指针都从表头开始走，slow每次走一步，fast每次走两步，如果fast遇到null，则说明没有环，
返回false；如果slow==fast，说明有环，并且此时fast超了slow一圈，返回true.为什么有环的情况下二者一定会相遇呢？因为fast先进入环，
在slow进入之后，如果把slow看作在前面，fast在后面每次循环都向slow靠近1，所以一定会相遇，而不会出现fast直接跳过slow的情况。*/
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
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode fast= head;
        ListNode slow= head;
        while (fast.next != null && fast.next.next != null) {
            fast= fast.next.next;
            slow= slow.next;
            if (fast == slow) return true;
        }
        return false;
    }
}
