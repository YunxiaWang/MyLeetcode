/* nlogn time*/
public class Solution {
    public int missingNumber(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        for (int i= 0; i < nums.length; i++) {
            if (nums[i] != i) return i;
        }
        return nums.length;
    }
}

/*The basic idea is to use XOR operation. We all know that a^b^b =a, which means two xor operations with the same number 
will eliminate the number and reveal the original number. In this solution, I apply XOR operation to both the index and value 
of the array. In a complete array with no missing numbers, the index and value should be perfectly corresponding( nums[index] = index), 
so in a missing array, what left finally is the missing number.*/
public class Solution {
    public int missingNumber(int[] nums) {
      int xor = 0, i = 0;
      for (i = 0; i < nums.length; i++) { 
        xor = xor ^ i ^ nums[i];
      }
      return xor^i; //length=n, should have n+1 numbers
    }
}

/*since the n numbers is from [0, n], we can just add all the numbers from [0, n] together and minus the sum of the n-1 numbers in array.*/
public static int missingNumber(int[] nums) {
    int sum = nums.length;
    for (int i = 0; i < nums.length; i++)
        sum += i - nums[i];
    return sum;
}
