/*数组太长 int long 长度不够
public class Solution {
    public int[] plusOne(int[] digits) {
        long n= 0;
        for (int i= 0; i < digits.length; i++){
            n= n*10 + digits[i];
        }
        n= n + 1;
        String s= "" + n;
        int[] result= new int[s.length()];
        for (int j= 0; j < result.length; j++) {
            result[j]= s.charAt(j) - 48; //得到的是数字char的ASCII码
        }
        return result;
    }
}*/
public class Solution {
    public int[] plusOne(int[] digits) {
        int l= digits.length;
        digits[l-1] += 1;
        for (int i= l-1; i > 0; i--){
            if (digits[i] == 10) {
                digits[i]= 0;
                digits[i-1] += 1;
            }
            else break; //当不需要进位时，记得break，节省时间
        }
        if (digits[0] == 10) {
            int[] result= new int[l+1];
            result[0]= 1;
           /* result[1]= 0;
            for (int j= 1; j < l; j++) //不需要再赋值，若最高位也进位，则最高位为1，其他都为0
                result[j+1]= digits[j];*/
            return result;
        }
        return digits;
    }
}
