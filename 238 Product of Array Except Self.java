public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left= 1;
        int[] product= new int[nums.length];
        product[nums.length-1]= 1;
        for (int i= nums.length-1; i >= 1; i--) {
            product[i-1] = product[i] * nums[i];
        }
        for (int i= 0; i < nums.length; i++) {
            product[i] *= left;
            left *= nums[i];
        }
        return product;
    }
}

/* no O(1) space solution, original thought
public int[] productExceptSelf(int[] nums) {
    int[] result = new int[nums.length];
    int[] leftProduct = new int[nums.length];
    int[] rightProduct = new int[nums.length];
    leftProduct[0]=1;
    rightProduct[nums.length-1]=1;
    //scan from left to right
    for(int i=0; i<nums.length-1; i++){
        leftProduct[i+1] = nums[i] * leftProduct[i];
    }
    //scan from right to left
    for(int i=nums.length-1; i>0; i--){
        rightProduct[i-1] = rightProduct[i] * nums[i];
    }
    //multiply
    for(int i=0; i<nums.length; i++){
        result[i] = leftProduct[i] * rightProduct[i];
    }
    return result;
}
*/
