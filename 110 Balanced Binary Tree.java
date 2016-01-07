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
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int dl = depth(root.left);
        int dr = depth(root.right);
        if (((dl-dr) <= 1) && ((dl-dr) >= -1)) 
            return isBalanced(root.left) && isBalanced(root.right); //if satisfy, check lower nodes
        return false; //return false at the end if difference is bigger than 1
    }
    public int depth(TreeNode root){
        if (root == null) return 0;
        int leftDepth = 1 + depth(root.left);
        int rightDepth = 1 + depth(root.right);
        return leftDepth >= rightDepth ? leftDepth : rightDepth;
    }
}
