/*NB解答 https://leetcode.com/discuss/9763/accepted-proper-explaination-does-anyone-have-better-idea */
public class Solution {
    public int singleNumber(int[] nums) {
        int ones=0, twos =0;
        int common_bit_mask;
        for(int i=0; i<nums.length; i++) {
            twos |= (ones & nums[i]);
            ones ^= nums[i];
            common_bit_mask= ~(ones & twos);
            ones &= common_bit_mask;
            twos &= common_bit_mask;
        }
        return ones;
    }
}
