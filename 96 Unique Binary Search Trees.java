/* 有点高端 https://leetcode.com/discuss/24282/dp-solution-in-6-lines-with-explanation-f-i-n-g-i-1-g-n-i 
unique BST 有点难定义啊*/
public class Solution {
    public int numTrees(int n) {
        int[] count= new int[n+1]; 
        count[0]= count[1]= 1;
        for (int i= 2; i <= n; i++) {
            for (int j= 1; j <= i; j++) {
                count[i] += count[j-1] * count[i-j];
            }
        }
        return count[n];
    }
}
