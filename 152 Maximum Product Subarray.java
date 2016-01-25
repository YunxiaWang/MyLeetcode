/* When iterating the array, each element has two possibilities: positive number or negative number. 
We need to track a minimum value, so that when a negative number is given, it can also find the maximum value. 
We define two local variables, one tracks the maximum and the other tracks the minimum. 又太难。*/
public class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
        int result= nums[0];
        int maxp= nums[0];
        int minp= nums[0];
        for (int i= 1; i < nums.length; i++) {
            int t= maxp;
            maxp= Math.max(Math.max(t*nums[i], nums[i]), minp*nums[i]);
            minp= Math.min(Math.min(t*nums[i], nums[i]), minp*nums[i]);
            result= Math.max(result, maxp);
        }
        return result;
    }
}
