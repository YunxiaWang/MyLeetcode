/*we actually do not need to handle negative sign. The sign can be preserved during the conversion.
 do boundary check in every step for overflow*/
public class Solution {
    public int reverse(int x) {
        int n= 0;
        while (x != 0) {
            if (Math.abs(n) > 214748364) //max integer is 214748364
                return 0;
            n= n*10 + x%10;
            x /= 10;
        }
        return n;
    }
}
