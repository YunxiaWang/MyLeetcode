public class Solution {
    public int minDepth(TreeNode root) {
        /*不好用BFS，当左节点不为叶子而右节点为叶子时，会多加层数
        if (root == null) return 0;
        Queue<TreeNode> q= new LinkedList<>();
        int d= 1;
        q.add(root);
        while (q.size() > 0) {
            TreeNode t= q.poll();
            if (t.left == null && t.right == null) break;
            if (t.left != null) q.add(t.left);
            if (t.right != null) q.add(t.right);
            d++;
        }
        return d;*/
        // 递归解法判断左右两边子树哪个depth最小，要注意如果有个节点只有一边孩子时，不能返回0，要返回另外一半边的depth。
        if (root == null) return 0;
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        if (leftDepth == 0 || rightDepth == 0)
            return leftDepth >= rightDepth ? leftDepth+1 : rightDepth+1;
        return leftDepth <= rightDepth ? leftDepth+1 : rightDepth+1;
    }
}
