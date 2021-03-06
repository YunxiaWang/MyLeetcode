/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }*/
/* Binary Search (dfs)*/
public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int count= countNode(root.left);
        if (k <= count) return kthSmallest(root.left, k);
        if (k > count+1) return kthSmallest(root.right, k-1-count);
        return root.val;
    }
    public int countNode(TreeNode root) {
        if (root == null) return 0;
        return 1 + countNode(root.left) + countNode(root.right);
    }
}

/* DFS in-order recursive */
    // better keep these two variables in a wrapper class
    private static int number = 0;
    private static int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        helper(root);
        return number;
    }
    public void helper(TreeNode n) {
        if (n.left != null) helper(n.left);
        count--;
        if (count == 0) {
            number = n.val;
            return;
        }
        if (n.right != null) helper(n.right);
    }

/* DFS in-order iterative */
  public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> st = new Stack<>();
        while (root != null) {
            st.push(root);
            root = root.left;
        }
        while (k != 0) {
            TreeNode n = st.pop();
            k--;
            if (k == 0) return n.val;
            TreeNode right = n.right;
            while (right != null) {
                st.push(right);
                right = right.left;
            }
        }
        return -1; // never hit if k is valid
  }
