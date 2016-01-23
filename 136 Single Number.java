/*using hashmap, too slow*/
public class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map= new HashMap<>();
        for (int i= 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) 
                map.put(nums[i], 2);
            else map.put(nums[i], 1);   
        }
        for (int n: map.keySet()) {
            if (map.get(n) != 2) 
                return n;
        }
        return 0;
    }
} 

/*using hashset, smaller space*/
public class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for (int n: nums) {
            if (!set.add(n)) set.remove(n);
        }
        Iterator<Integer> it= set.iterator();
        return it.next();
    }
}

/*The key to solve this problem is bit manipulation. XOR will return 1 only on two different bits. 
So if two numbers are the same, XOR will return 0. Finally only one number left.*/
public class Solution {
    public int singleNumber(int[] nums) {
        int x= 0;
        for (int n : nums){
            x= x ^ n;
        }
        return x;
    }
}
