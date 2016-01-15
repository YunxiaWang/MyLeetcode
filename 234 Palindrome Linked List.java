/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 /* use stack, long run time, use extra space*/
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        Stack<ListNode> stack= new Stack<>();
        ListNode t= head;
        while (t != null) {
            stack.push(t);
            t= t.next;
        }
        t= head;
        while (!stack.empty() && t != null) {
            if (stack.peek().val != t.val) return false;
            stack.pop();
            t= t.next;
        }
        return true;
    }
}

/*We can use a fast and slow pointer to get the center of the list, 
then reverse the second list and compare two sublists. The time is O(n) and space is O(1).*/
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        //find list center
        ListNode tail= head;
        ListNode middle= head;
        while(tail.next != null && tail.next.next != null) {
            tail= tail.next.next; //double speed
            middle= middle.next; //find the middle node
        }
        //reverse second part of the list
        ListNode secondHead= middle.next; //head of the second half of the list
        ListNode t1= secondHead;
        ListNode t2= secondHead.next;
        while (t1 != null && t2 != null) { //reverse the second half of the list
            ListNode t= t2.next; //preserve the next node
            t2.next= t1; //reverse
            t1= t2; //move forward
            t2= t;
        }
        secondHead.next= null; //process the tail
        //compare two sublists
        ListNode t= head;
        while (t1 != null) {
            if (t1.val != t.val) return false;
            t1= t1.next;
            t= t.next;
        }
        return true;
    }
}
