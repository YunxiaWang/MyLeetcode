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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) 
            return null;
        TreeNode t = root.left; //use temp variable to store the value before modification!
        root.left = invertTree(root.right);
        root.right = invertTree(t);
        return root;
    }
}
