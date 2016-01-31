/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        //if (head.next == null) return new TreeNode(head.val);
        ListNode fast= head;
        ListNode slow= head;
        ListNode pre= null; //set a pre node to find the node before slow in one loop
        while (fast.next != null && fast.next.next != null) {
            fast= fast.next.next;
            pre= slow;
            slow= slow.next;
        }
        TreeNode root= new TreeNode(slow.val);
        if (pre != null) pre.next= null;
        else head= null; //set head to null to set null for left tree
        root.left= sortedListToBST(head);
        root.right= sortedListToBST(slow.next);
        return root;
    }
}
