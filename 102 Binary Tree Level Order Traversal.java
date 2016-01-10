/** Breadth First Search
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root ==  null) return result; // return new list instead of null
        List<Integer> list = new ArrayList<Integer>();
        List<TreeNode> q = new ArrayList<TreeNode>(); // use as queue for bfs
        TreeNode rightMost = root; // the last node of one level
        TreeNode b = null; // rightMost node pointer
        q.add(root);
        while (!q.isEmpty()){
            TreeNode t = q.get(0);
            list.add(t.val);
            q.remove(0);
            if (t == rightMost) {
                result.add(list);
                list = new ArrayList<Integer>();
                if (t.right != null) rightMost = t.right;
                else if (t.left != null) rightMost = t.left;
                else rightMost = b;
            }
            if (t.left != null) {
                q.add(t.left);
                b= t.left;
            }
            if (t.right != null) {
                q.add(t.right);
                b= t.right;
            }
        }
        return result;
    }
}
