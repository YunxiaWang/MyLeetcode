public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i])+1);
            else 
                map.put(nums[i], 1);
        }
        for (int k: map.keySet()){
            if (map.get(k) > nums.length/2)
                return k;
        }
        return nums[0];
    }
}
//another example to use hashmap
