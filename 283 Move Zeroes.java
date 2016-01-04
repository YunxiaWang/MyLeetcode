public class Solution {
    public void moveZeroes(int[] nums) {
       int y = 0;
       for (int x = 0; x < nums.length; x++){
           if (nums[x] != 0) {
               int t = nums[x];
               nums[x] = nums[y];
               nums[y] = t;
               y++;
           }
       }
    }
}
/*解题思路：题目可以在O(n)时间复杂度内求解
算法步骤：使用两个"指针"x和y，初始令y = 0;利用x遍历数组nums:若nums[x]非0，则交换nums[x]与nums[y]，并令y+1
算法简析：y指针指向首个0元素可能存在的位置;遍历过程中，算法确保[y, x)范围内的元素均为0
*/
