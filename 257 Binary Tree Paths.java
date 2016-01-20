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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list= new ArrayList<>();
        if (root == null) return list;
        //String path= String.valueOf(root.val);
        List<Integer> path= new ArrayList<>(); //用list方便remove回溯
        path.add(root.val);
        dfs(root, path, list);
        return list;
    }
    
    public void dfs(TreeNode root, List<Integer> path, List<String> list) {
        if (root.left != null) {
            //path = path + "->" + String.valueOf(root.left.val);
            path.add(root.left.val);
            dfs(root.left, path, list);
            //path.remove(path.size()-1);
        } 
        if (root.right != null) {
            //path = path + "->" + String.valueOf(root.right.val);
            path.add(root.right.val);
            dfs(root.right, path, list);
            //path.remove(path.size()-1);
        } 
        if (root.left == null && root.right == null) {
            String p= "";
            for (int i= 0; i < path.size()-1; i++) {
                p= p + String.valueOf(path.get(i)) + "->";
            }
            p= p + String.valueOf(path.get(path.size()-1));
            list.add(p);
            //path.remove(path.size()-1);
            //path= path.substring(0, path.length()-3);
        }
        path.remove(path.size()-1); //在函数的最后统一回溯，而不是在每一次迭代之后
    }
}
