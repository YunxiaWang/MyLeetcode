public class NumArray { //too slow for large array
    private int[] array;
    public NumArray(int[] nums) {
        array= new int[nums.length];
        for (int i= 0; i < array.length; i++)
            array[i]= nums[i];
    }
    public int sumRange(int i, int j) {
        int sum= 0;
        for (int m= i; m <= j; m++) 
            sum += array[m];
        return sum;
    }
}
/* use dynamic programming: store sum of former elements in the array */
public class NumArray {
    private int[] array;
    public NumArray(int[] nums) {
        //array= new int[nums.length];
        array= nums; // You may assume that the array does not change. so can rewrite into the original array
        for (int i= 1; i < array.length; i++)
            array[i]= nums[i] + nums[i-1];
    }
    public int sumRange(int i, int j) {
        return i == 0? array[j]: array[j] - array[i-1];
    }
}

// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);
