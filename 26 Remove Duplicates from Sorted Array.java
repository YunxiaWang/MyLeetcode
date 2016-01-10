public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int count = 1;
        int i = 0; // 2 pointers
        int j = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) j++;
            else {
                nums[i+1] = nums[j];
                count++;
                i++;
                j++;
            }
        }
        return count;
    }
}
