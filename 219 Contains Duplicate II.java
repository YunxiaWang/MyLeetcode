/* time limit exceeded
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i= 0; int j= 1;
        while (i < nums.length-1) {
            if (j < nums.length-1 && nums[i] != nums[j]) j++;
            else {
                if (nums[i] == nums[j] && j - i <= k) return true;
                i++;
                j= i + 1;
            }
        }
        return false;
    }
}*/
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map= new HashMap<>();
        for (int i= 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) map.put(nums[i], i);
            else if (i - map.get(nums[i]) <= k) return true;
            else map.put(nums[i], i);
        }
        return false;
    }
}
