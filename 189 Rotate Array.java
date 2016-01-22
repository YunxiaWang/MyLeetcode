/* Solution 1 - Intermediate Array: create a new array and then copy elements to the new array. */
public class Solution {
    public void rotate(int[] nums, int k) {
        if (k >= nums.length) k= k%nums.length;
        if (k <= 0) return;
        int[] t= new int[k];
        int j = k-1;
        for (int i= nums.length-1; i > nums.length-1-k; i--) {
            t[j]= nums[i];
            j--;
        }
        for (int i= nums.length-k-1; i >= 0; i--) {
            nums[i+k]= nums[i];
        }
        for (int i= 0; i < k;i++) {
            nums[i]= t[i];
        }
    }
}

/*Solution 2 - Bubble Rotate: do this in O(1) space? This solution is like a bubble sort. However, the time is O(n*k).*/
public static void rotate(int[] arr, int order) {
	if (arr == null || order < 0) {
	    throw new IllegalArgumentException("Illegal argument!");
	}
	for (int i = 0; i < order; i++) {
		for (int j = arr.length - 1; j > 0; j--) {
			int temp = arr[j];
			arr[j] = arr[j - 1];
			arr[j - 1] = temp;
		}
	}
}

/*Solution 3 - Reversal: do this in O(1) space and in O(n) time
1. Divide the array two parts: [0 ~ n-k-1] and [n-k ~ n-1]
2. Rotate first part; 3. Rotate second part; 4. Rotate the whole array.*/
public static void rotate(int[] arr, int order) {
	order = order % arr.length;
	if (arr == null || order < 0) {
		throw new IllegalArgumentException("Illegal argument!");
	}
	//length of first part
	int a = arr.length - order; 
	reverse(arr, 0, a-1);
	reverse(arr, a, arr.length-1);
	reverse(arr, 0, arr.length-1);
}
 
public static void reverse(int[] arr, int left, int right){
	if(arr == null || arr.length == 1) 
		return;
	while(left < right){
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		left++;
		right--;
	}	
}
