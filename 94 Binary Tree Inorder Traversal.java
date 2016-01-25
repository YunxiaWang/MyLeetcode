public class Solution {
    List<Integer> inorder= new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return inorder;
        inorderTraversal(root.left);
        inorder.add(root.val);
        inorderTraversal(root.right);
        return inorder;
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution { //too hard
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder= new ArrayList<>();
        Stack<TreeNode> stack= new Stack<>();
        TreeNode node= root;
        while (node != null || !stack.empty()) {
            while (node != null) {
                stack.push(node);
                node= node.left;
            }
            node= stack.pop();
            inorder.add(node.val);
            node= node.right;
        }
        return inorder;
    }
}
