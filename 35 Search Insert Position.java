public class Solution {
    public int searchInsert(int[] nums, int target) {
        int h= -1;
        int t= nums.length;
        while(h != t-1) {
            int e= (h+t)/2;
            if (target < nums[e]) t= e;
            else h= e;
        }
        if (h < 0 || nums[h] != target) return h+1;
        return h;
    }
}
