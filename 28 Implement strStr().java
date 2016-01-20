public class Solution {
    public int strStr(String haystack, String needle) {
        //if (haystack == "" && needle == "") return 0; //不需要先判断为空
        int m= haystack.length();
        int n= needle.length();
        for (int i= 0; i <= m-n; i++) { //注意是'<='
            if (haystack.substring(i, i+n).equals(needle)) return i; //要用‘equals’，不能用‘==’
        }
        return -1;
    }
}
