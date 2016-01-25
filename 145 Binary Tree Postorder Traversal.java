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
    List<Integer> post= new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return post;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        post.add(root.val);
        return post;
    }
}
