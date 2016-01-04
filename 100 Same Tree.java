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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;    //check null first
        while (p != null && q != null){   //following condition
            if (p.val != q.val) return false;    //check unequal and return false first
            boolean l = isSameTree(p.left, q.left);
            boolean r = isSameTree(p.right, q.right);
            return l && r;
        }
        return false;
    }
}
