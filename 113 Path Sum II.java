/**求所有满足条件的路径，所以我们需要数据结构来维护中间路径结果以及保存满足条件的所有路径。这里的时间复杂度仍然只是一次遍历O(n)，
而空间复杂度则取决于满足条件的路径和的数量（假设是k条），则空间是O(klogn).
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if (root == null) return result;
        list.add(root.val); // add root before recursion
        dfs(root, sum - root.val, result, list); // sum-root.val because root has already been added
        return result;
    }
    
    public void dfs(TreeNode root, int sum, List<List<Integer>> result, List<Integer> list) {
        if (root == null) return;
        if (root.left == null && root.right == null && sum == 0){ //leaf node satisfy the sum=0
            result.add(new ArrayList<Integer>(list)); //create a new copy of list
            return;
        }
        if (root.left != null) {
            list.add(root.left.val);
            dfs(root.left, sum - root.left.val, result, list);
            list.remove(list.size()-1); //go back to the parent
        }
        if (root.right != null) {
            list.add(root.right.val);
            dfs(root.right, sum - root.right.val, result, list);
            list.remove(list.size()-1);
        }
    }
}
