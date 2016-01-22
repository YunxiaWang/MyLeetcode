public class Solution {
    public int myAtoi(String str) {
        str= str.trim();
        if (str.length() == 0 || !(str.charAt(0)>='0' || str.charAt(0)<='9'|| str.charAt(0)=='-' || str.charAt(0)=='+')) return 0;
        boolean negative= false; //不好用startsWith()和regular expression,要用char的大小做比较。判断的逻辑要搞清楚
        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            if (str.charAt(0) == '-') negative = true;
            str= str.substring(1);
        }
        double num= 0; //用double，不然在最大值比较的时候会出错
        for (int i= 0; i < str.length(); i++) {
            if (num > 2147483647 && negative) return -2147483648;
            if (num > 2147483647) return 2147483647;
            if (str.charAt(i)<'0' || str.charAt(i)>'9') break;
            else num= num*10 + (str.charAt(i)-'0'); //要乘出来，直接用parseInt在超过最大值时会出错
        }
        return negative? (int)(0-num): (int)num; //最后强制转换int
    }
}
//各种情况我要疯了
