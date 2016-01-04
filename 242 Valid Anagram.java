/*使用哈希表映射，用一个数组来代替哈希表，使用类似方法的题目有Minimum Window Substring 最小窗口子串，Isomorphic Strings 同构字符串，
Longest Substring Without Repeating Characters 最长无重复子串 和 Unique Characters of a String 字符串中不同的字符。

先判断两个字符串长度是否相同，不相同直接返回false。
然后把s中所有的字符出现个数统计起来，存入一个大小为26的数组中，因为题目中限定了输入字符串为小写字母组成。
然后再来统计t字符串，如果发现不匹配则返回false.
如果s和t是anagram ， 那么最后的数组中所有字符的计数都应该是0， 否则就不是anagram。*/
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26]; //array definition
        for (int i = 0; i < s.length(); i++)
            count[s.charAt(i) - 'a']++;
        for (int j = 0; j < t.length(); j++){
            if (--count[t.charAt(j) - 'a'] < 0) // place '--' before count[] 先自减再比较
                return false;
        }
        return true;
    }
}


/*time limit exceeded*/
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        for (int i = 0; i < t.length(); i++){
            int index = s.indexOf(t.charAt(i));
            if (index < 0) {
                return false;
            }
            String k = s;
            s = k.substring(0, index).concat(k.substring(index+1, k.length()));
        }
        return true;
    }
}
