/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 用两个指针*/
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode oddHead= head;
        ListNode odd = head;
        ListNode evenHead = head.next;
        ListNode even = head.next;
        while (even != null && even.next != null) {
            odd.next= even.next;
            odd= odd.next;
            even.next= odd.next;
            even= even.next;
        }
        odd.next= evenHead;
        return oddHead;
    }
}
