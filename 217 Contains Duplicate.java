public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(); // map definition, only type in '<>'
        for (int i = 0; i < nums.length; i++){        //Map is an abstract class cannot be instantiated, use 'new HashMap'                      
            if (map.containsKey(nums[i]))             //can only use class name in '<>', use wrapper class 'Integer'
                return true;
            map.put(nums[i], 1);
        }
        return false;
    }
}
