/* moving element of A and B backwards. */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int i = m - 1;
	    int j = n - 1;
	    int k = m + n - 1;
	    while (k >= 0) {
		    if (j < 0 || (i >= 0 && nums1[i] > nums2[j])) //对Jd的判断放在前面，不然会数组边界溢出，因为后面会取到nums2[-1]
		    	nums1[k--] = nums1[i--];
	    	else
			    nums1[k--] = nums2[j--];
	    }
    }
}
