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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }
/* use two parameters for helper function to do recursive */
    public boolean isSymmetric(TreeNode l, TreeNode r) {
        if (l == null && r == null) return true;
        else if (l == null || r == null) return false; //after 'else', only one is null
        if (l.val != r.val) return false; // neither are null
        if (!isSymmetric(l.left, r.right)) return false; // put recursion in if
        if (!isSymmetric(l.right, r.left)) return false;
        return true; 
    }
}
