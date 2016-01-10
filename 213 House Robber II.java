/*There are two cases here: 1) 1st element is included and last is not included; 2) 1st is not included and last is included.
Therefore, we can use the similar dynamic programming approach to scan the array twice and get the larger value.*/
public class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        if (nums == null || n == 0) return 0;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        int[] a= new int[n];
        a[0]= 0;
        a[1]= nums[0]; //start from 0
        for (int i= 2; i < n; i++){ //bound to nums[n-2]
            a[i]= Math.max(a[i-2] + nums[i-1], a[i-1]); //nums[i-1]
        }
        int[] b= new int[n];
        b[0]= 0;
        b[1]= nums[1]; //start from 1
        for (int i= 2; i < n; i++){ //bound to nums[n-1]
            b[i]= Math.max(b[i-2] + nums[i], b[i-1]); // nums[i]
        }
        return Math.max(a[n-1], b[n-1]);
    }
}
