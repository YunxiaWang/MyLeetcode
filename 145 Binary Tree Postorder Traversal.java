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
/*666
pre-order traversal is root-left-right, and post order is left-right-root.
modify the code for pre-order to make it root-right-left, and then reverse the output so that we can get left-right-root .
1.Create an empty stack, Push root node to the stack.
2.Do following while stack is not empty.
2.1. pop an item from the stack and print it.
2.2. push the left child of popped item to stack.
2.3. push the right child of popped item to stack.
3.reverse the ouput.*/
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> post= new ArrayList<>();
        Stack<TreeNode> stack= new Stack<>();
        Stack<Integer> reverse= new Stack<>();
        if (root == null) return post;
        stack.push(root);
        while (!stack.empty()) {
            root= stack.pop();
            reverse.push(root.val);
            if (root.left != null) stack.push(root.left);
            if (root.right != null) stack.push(root.right);
        }
        while (!reverse.empty()) {
            post.add(reverse.pop());
        }
        return post;
    }
}
