/*不要说话
This problem can be solved by using two indices.*/
public class Solution {
    public int removeElement(int[] nums, int val) {
    int i=0;
    int j=0;
    while(j < nums.length){
        if(nums[j] != val){
            nums[i] = nums[j];
            i++; 
        }
        j++;
    }
    return i;
    }
}

/* 日了狗写这么长还写不对
public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        mergeSort(nums, 0, k-1);
        int count = 0;
        int r= 0;
        /*int h = -1;
        while (h != k-1) {
            int t = (h+k)/2;
            if (nums[t] <= val) h = t;
            else k = t;
        }
        if (h < k && h >= 0){
            for (int i = h; i < k; i++){
                if (nums[h] == val) count++;
                else break;
            }
            for (int j = h; j < k-count; j++)
                nums[j] = nums[j+count];
        }*/
        for (int i= 0; i < k; i++){
            if (nums[i] == val) {
                count++;
                r= i;
            }
        }
        for (int j= r-count+1; j < k-count; j++)
            nums[j] = nums[j+count];
        return k-count;
    }
    
    public void mergeSort(int[] nums, int h, int k){
        if (k - h < 1) return;
        mergeSort(nums, h, (h+k)/2);
        mergeSort(nums, (h+k)/2+1, k);
        merge(nums, h, (h+k)/2, k);
    }
    
    public void merge(int[] nums, int h, int t, int k){
        /*int[] a = new int[k-h+1];
        int i = h; 
        int j = t+1;
        for (int m = h; m <= k-h; m++) {
            if(i <= t && (nums[i] <= nums[j] || j > k)) {
                a[m] = nums[i];
                i++;
            } else {
                a[m] = nums[j];
                j++;
            }
        }
        nums = a;*/
        int[] c= new int[t-h+1];
        for (int a= 0; a <= t-h; a++){
            c[a]= nums[h];
            h++;
        }
        // {c is a copy of original b[h..e]}
        int i= h; int j= t+1; int m= 0;
        /* inv: b[h..i-1] contains its final, sorted values
         b[j..k] remains to be transferred
         c[m..e-h] remains to be transferred
         */
        for (i= h; i != k+1; i++) {
            if (j <= k && (m > t-h || nums[j] <= c[m])) {
                nums[i]= nums[j]; j= j+1;
            } else {
                nums[i]= c[m]; m= m+1;
            }
        }
    }
}
*/
