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
        List<Integer> pre= new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return pre;
        pre.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return pre;
    }
}

/* iteratively using stack. push right before left, so that pop left before right */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> pre= new ArrayList<>();
        Stack<TreeNode> stack= new Stack<>();
        stack.push(root); //stack can push null elements
        while (!stack.empty()) {
            root= stack.pop();
            if (root != null) {
                pre.add(root.val);
                stack.push(root.right);
                stack.push(root.left);
            }
        }
        return pre;
    }
}
