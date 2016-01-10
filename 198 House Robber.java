/* Dynamic Programming
use a extra array maxToPos[] to store the maximum we could get after we leave each house i. 
The rationale is when the robber is at house i, to get the most money and with 100% safety, he/she either:
1.just robbed house i-2; robber will rob house i for sure, and with 100% safety! The max the robber could get is maxToPos[i-2]+num[i-1];
2.just robbed house i-1; the robber won’t rob the house, o/w would be caught by police. The max the robber could get is maxToPos[i-1];
*/
public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0 || nums == null) return 0;
        int[] maxToPos = new int[nums.length+1];
        maxToPos[0]= 0;
        maxToPos[1]= nums[0];
        for (int i= 2; i <= nums.length; i++){
            maxToPos[i]= Math.max(maxToPos[i-2]+nums[i-1], maxToPos[i-1]); 
        }
        return maxToPos[maxToPos.length-1];
    }
}
