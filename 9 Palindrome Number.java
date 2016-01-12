public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        else if (x < 10) return true;
        int count= 0;
        int n= x; //先保存数据
        while (x > 0){ //得出数字的位数
            x /= 10;
            count++;
        }
        for (int i= 1; i <= count; i += 2) {
            if ((n / (int)Math.pow(10, count-i)) != (n % 10)) { //用Math.pow记得转换成int型
                return false;
            }
            n %= (int)Math.pow(10, count-i);
            n /= 10;
        }
        return true;
    }
}
