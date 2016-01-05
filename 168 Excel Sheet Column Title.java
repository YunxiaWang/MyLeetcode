/* n先减1即可看作10进制转26进制，取余依次得到倒序的位数
这数学太TM难了啊 小学都没学好啊*/
public class Solution {
    public String convertToTitle(int n) {
        String s = "";
        while (n > 0){
            n--;
            s = (char)(n % 26 + 'A') + s;
            n = n / 26;
        }
        return s;
    }
}
