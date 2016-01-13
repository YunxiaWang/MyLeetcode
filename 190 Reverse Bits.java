/*把要翻转的数从右向左一位位的取出来，然后加到新生成的数的最低位即可*/
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result= 0;
        for (int i= 0; i < 32; i++){
            if ((n & 1) == 1)
                result= (result << 1) | 1; //use '|' instead of '+' 1
            else result <<= 1;
            n >>>= 1;
        }
        return result;
    }
}
