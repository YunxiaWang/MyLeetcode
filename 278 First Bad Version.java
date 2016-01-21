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
