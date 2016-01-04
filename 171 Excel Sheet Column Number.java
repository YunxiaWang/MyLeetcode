/*26进制到10进制的转换*/
public class Solution {
    public int titleToNumber(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++){
            number = number + (int)(Math.pow(26, (s.length()-i-1))) * (s.charAt(i)-'A'+1); 
            }   //用Math.pow()做乘方运算，double到int要强制转换
        return number;
    }
}
