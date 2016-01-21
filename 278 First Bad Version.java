/* time limit exceeded*/
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int h= 1;
        int t= n+1;
        while (h <= n) {
            int e= (h+t)/2;
            if (isBadVersion(e) && (isBadVersion(e-1))) t= e-1;
            else if ((!isBadVersion(e)) && (!isBadVersion(e-1))) h= e+1;
            else return e;
        }
        return h;
    }
}
/*just use simple binary search */
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (n == 1) return 1;
        int left = 1;
        int right = n;
        while (left < right) { //注意边界
             int mid = left + (right - left) / 2;
             if (isBadVersion(mid)) {
                 right = mid;
             } else {
                 left = mid + 1; //
             }
         }
         return right;
    }
}
