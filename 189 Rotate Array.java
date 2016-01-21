public class Solution {
    public void rotate(int[] nums, int k) {
        if (k >= nums.length) k= k%nums.length;
        if (k <= 0) return;
        int[] t= new int[k];
        int j = k-1;
        for (int i= nums.length-1; i > nums.length-1-k; i--) {
            t[j]= nums[i];
            j--;
        }
        for (int i= nums.length-k-1; i >= 0; i--) {
            nums[i+k]= nums[i];
        }
        for (int i= 0; i < k;i++) {
            nums[i]= t[i];
        }
    }
}
