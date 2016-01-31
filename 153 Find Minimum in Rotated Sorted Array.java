/* 1.a[mid] > a[left] && a[mid] > a[right], meaning we are on the bigger part, the smaller part is on our right, so go right
2. a[mid] < a[left] && a[mid] < a[right], meaning we are on the smaller part, to find the smallest element, go left */
public class Solution {
    public int findMin(int[] nums) {
        int h= 0;
        int t= nums.length-1; // the index, cannot be out of bound
        while (h < t-1) {
            int e= (h+t)/2;
            if (nums[e] > nums[t]) h= e;
            else t= e;
        }
        if (nums[h] < nums[t]) return nums[h]; //consider when the rotate is just one cycle
        return nums[t];
    }
}
